package com.tiandy.server;

import com.tiandy.model.*;
import io.grpc.stub.StreamObserver;

/**
 * Created by tkom on 2019/5/28 0028.
 * Grpc服务端实现
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void getInfos(InfoRequest request, StreamObserver<InfoResponse> responseObserver) {

        System.out.println("request"+request.getMsg());
        InfoResponse response = InfoResponse.newBuilder().setInfos("fffffffffff").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public io.grpc.stub.StreamObserver<GreetRequest> greetingStream(
            final io.grpc.stub.StreamObserver<GreetResponse> responseObserver) {
        return new StreamObserver<GreetRequest>() {
            public void onNext(GreetRequest greetRequest) {
                System.out.println("接收到："+ greetRequest.getName());
                responseObserver.onNext(GreetResponse.newBuilder().setMsg(greetRequest.getName()).build());
            }

            public void onError(Throwable throwable) {
                System.out.println(throwable);
            }

            public void onCompleted() {
                System.out.println("接收完成");
                responseObserver.onCompleted();
            }
        };
    }

}
