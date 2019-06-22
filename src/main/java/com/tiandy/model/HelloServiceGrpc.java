package com.tiandy.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 * <pre>
 **
 * 指定服务，客户端和服务端的stub, 服务端需要实现接口，客户端直接调用该接口。
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: grpc.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "HelloService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getGetInfosMethod()} instead.
  public static final io.grpc.MethodDescriptor<InfoRequest,
          InfoResponse> METHOD_GET_INFOS = getGetInfosMethodHelper();

  private static volatile io.grpc.MethodDescriptor<InfoRequest,
          InfoResponse> getGetInfosMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<InfoRequest,
          InfoResponse> getGetInfosMethod() {
    return getGetInfosMethodHelper();
  }

  private static io.grpc.MethodDescriptor<InfoRequest,
          InfoResponse> getGetInfosMethodHelper() {
    io.grpc.MethodDescriptor<InfoRequest, InfoResponse> getGetInfosMethod;
    if ((getGetInfosMethod = HelloServiceGrpc.getGetInfosMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetInfosMethod = HelloServiceGrpc.getGetInfosMethod) == null) {
          HelloServiceGrpc.getGetInfosMethod = getGetInfosMethod =
              io.grpc.MethodDescriptor.<InfoRequest, InfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HelloService", "GetInfos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  InfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  InfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("GetInfos"))
                  .build();
          }
        }
     }
     return getGetInfosMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getGreetingMethod()} instead.
  public static final io.grpc.MethodDescriptor<GreetRequest,
          GreetResponse> METHOD_GREETING = getGreetingMethodHelper();

  private static volatile io.grpc.MethodDescriptor<GreetRequest,
          GreetResponse> getGreetingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<GreetRequest,
          GreetResponse> getGreetingMethod() {
    return getGreetingMethodHelper();
  }

  private static io.grpc.MethodDescriptor<GreetRequest,
          GreetResponse> getGreetingMethodHelper() {
    io.grpc.MethodDescriptor<GreetRequest, GreetResponse> getGreetingMethod;
    if ((getGreetingMethod = HelloServiceGrpc.getGreetingMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGreetingMethod = HelloServiceGrpc.getGreetingMethod) == null) {
          HelloServiceGrpc.getGreetingMethod = getGreetingMethod =
              io.grpc.MethodDescriptor.<GreetRequest, GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "HelloService", "Greeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GreetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("Greeting"))
                  .build();
          }
        }
     }
     return getGreetingMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getGreetingStreamMethod()} instead.
  public static final io.grpc.MethodDescriptor<GreetRequest,
          GreetResponse> METHOD_GREETING_STREAM = getGreetingStreamMethodHelper();

  private static volatile io.grpc.MethodDescriptor<GreetRequest,
          GreetResponse> getGreetingStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<GreetRequest,
          GreetResponse> getGreetingStreamMethod() {
    return getGreetingStreamMethodHelper();
  }

  private static io.grpc.MethodDescriptor<GreetRequest,
          GreetResponse> getGreetingStreamMethodHelper() {
    io.grpc.MethodDescriptor<GreetRequest, GreetResponse> getGreetingStreamMethod;
    if ((getGreetingStreamMethod = HelloServiceGrpc.getGreetingStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGreetingStreamMethod = HelloServiceGrpc.getGreetingStreamMethod) == null) {
          HelloServiceGrpc.getGreetingStreamMethod = getGreetingStreamMethod =
              io.grpc.MethodDescriptor.<GreetRequest, GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "HelloService", "GreetingStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GreetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("GreetingStream"))
                  .build();
          }
        }
     }
     return getGreetingStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   * <pre>
   **
   * 指定服务，客户端和服务端的stub, 服务端需要实现接口，客户端直接调用该接口。
   * </pre>
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getInfos(InfoRequest request,
        io.grpc.stub.StreamObserver<InfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfosMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *请求的参数为流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<GreetRequest> greeting(
        io.grpc.stub.StreamObserver<GreetResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetingMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *请求的参数为流，响应的参数为流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<GreetRequest> greetingStream(
        io.grpc.stub.StreamObserver<GreetResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetingStreamMethodHelper(), responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetInfosMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                      InfoRequest,
                      InfoResponse>(
                  this, METHODID_GET_INFOS)))
          .addMethod(
            getGreetingMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                      GreetRequest,
                      GreetResponse>(
                  this, METHODID_GREETING)))
          .addMethod(
            getGreetingStreamMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                      GreetRequest,
                      GreetResponse>(
                  this, METHODID_GREETING_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * 指定服务，客户端和服务端的stub, 服务端需要实现接口，客户端直接调用该接口。
   * </pre>
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub> {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void getInfos(InfoRequest request,
        io.grpc.stub.StreamObserver<InfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfosMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *请求的参数为流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<GreetRequest> greeting(
        io.grpc.stub.StreamObserver<GreetResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGreetingMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *请求的参数为流，响应的参数为流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<GreetRequest> greetingStream(
        io.grpc.stub.StreamObserver<GreetResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGreetingStreamMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   **
   * 指定服务，客户端和服务端的stub, 服务端需要实现接口，客户端直接调用该接口。
   * </pre>
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public InfoResponse getInfos(InfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfosMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * 指定服务，客户端和服务端的stub, 服务端需要实现接口，客户端直接调用该接口。
   * </pre>
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<InfoResponse> getInfos(
        InfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfosMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFOS = 0;
  private static final int METHODID_GREETING = 1;
  private static final int METHODID_GREETING_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INFOS:
          serviceImpl.getInfos((InfoRequest) request,
              (io.grpc.stub.StreamObserver<InfoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greeting(
              (io.grpc.stub.StreamObserver<GreetResponse>) responseObserver);
        case METHODID_GREETING_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetingStream(
              (io.grpc.stub.StreamObserver<GreetResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Hello.getDescriptor();
    }

    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getGetInfosMethodHelper())
              .addMethod(getGreetingMethodHelper())
              .addMethod(getGreetingStreamMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
