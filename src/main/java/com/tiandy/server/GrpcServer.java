package com.tiandy.server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Created by tkom on 2019/5/28 0028.
 * grpc服务端
 */
public class GrpcServer {
    private int port = 8851;
    private Server server;

    private void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService((BindableService) new HelloServiceImpl())
                .build()
                .start();

        System.out.println("service start...");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {

                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                GrpcServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        final GrpcServer server = new GrpcServer();
        server.start();
        server.blockUntilShutdown();
    }

}
