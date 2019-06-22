package com.tiandy.client;

import com.tiandy.model.GreetRequest;
import com.tiandy.model.GreetResponse;
import com.tiandy.model.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by tkom on 2019/5/28 0028.
 * grpc客户端   测试grpc双向流
 */
public class GrpcClient {
    private final ManagedChannel channel;
    private final HelloServiceGrpc.HelloServiceStub stub;

    public GrpcClient(String host,int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext(true)
                .build();

        stub = HelloServiceGrpc.newStub(channel); //异步存根
    }
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public  void greetStream(){
        //判断调用状态。在内部类中被访问，需要加final修饰
        //final CountDownLatch countDownLatch = new CountDownLatch(1);
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

        StreamObserver<GreetRequest> request = stub.greetingStream(new StreamObserver<GreetResponse>(){

            public void onNext(GreetResponse greetResponse) {
                System.out.println("服务端回应：" + greetResponse.getMsg());
            }

            public void onError(Throwable throwable) {
                System.out.println(throwable);
            }

            public void onCompleted() {
                System.out.println("服务端完成");
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //countDownLatch.countDown();
            }
        });

        for(int i = 0; i < 100; i++){
            request.onNext(GreetRequest.newBuilder().setName(""+i).build());
        }
        request.onCompleted();
        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //countDownLatch.await();
        System.out.println("11111111111");
    }



    public static void main(String[] args) throws InterruptedException {
        GrpcClient client = new GrpcClient("127.0.0.1", 8851);
        client.greetStream();
        client.shutdown();
    }

}
