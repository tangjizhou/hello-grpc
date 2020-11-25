package com.asiainfo.yuwen.grpc.helloworld;

import io.grpc.MethodDescriptor;
import io.grpc.stub.ClientCalls;
import io.grpc.stub.ServerCalls;

/**
 * <pre>
 * greeting服务定义
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.3.0)",
        comments = "Source: helloworld.proto")
public final class GreeterGrpc {

    private GreeterGrpc() {
    }

    public static final String SERVICE_NAME = "Greeter";

    // Static method descriptors that strictly reflect the proto.
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static final io.grpc.MethodDescriptor<HelloWorldProto.HelloRequest,
            HelloWorldProto.HelloReply> METHOD_SAY_HELLO =
            io.grpc.MethodDescriptor.create(
                    io.grpc.MethodDescriptor.MethodType.UNARY,
                    MethodDescriptor.generateFullMethodName(
                            "Greeter", "SayHello"),
                    io.grpc.protobuf.ProtoUtils.marshaller(HelloWorldProto.HelloRequest.getDefaultInstance()),
                    io.grpc.protobuf.ProtoUtils.marshaller(HelloWorldProto.HelloReply.getDefaultInstance()));
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static final io.grpc.MethodDescriptor<HelloWorldProto.HelloRequest,
            HelloWorldProto.HelloReply> METHOD_SAY_HELLO_AGAIN =
            io.grpc.MethodDescriptor.create(
                    io.grpc.MethodDescriptor.MethodType.UNARY,
                    MethodDescriptor.generateFullMethodName(
                            "Greeter", "SayHelloAgain"),
                    io.grpc.protobuf.ProtoUtils.marshaller(HelloWorldProto.HelloRequest.getDefaultInstance()),
                    io.grpc.protobuf.ProtoUtils.marshaller(HelloWorldProto.HelloReply.getDefaultInstance()));

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static GreeterStub newStub(io.grpc.Channel channel) {
        return new GreeterStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static GreeterBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new GreeterBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
     */
    public static GreeterFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new GreeterFutureStub(channel);
    }

    /**
     * <pre>
     * greeting服务定义
     * </pre>
     */
    public static abstract class GreeterImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * sayHello方法，格式为"方法名 请求参数 返回参数"
         * </pre>
         */
        public void sayHello(HelloWorldProto.HelloRequest request,
                             io.grpc.stub.StreamObserver<HelloWorldProto.HelloReply> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
        }

        /**
         * <pre>
         * 另一个sayHello方法
         * </pre>
         */
        public void sayHelloAgain(HelloWorldProto.HelloRequest request,
                                  io.grpc.stub.StreamObserver<HelloWorldProto.HelloReply> responseObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(METHOD_SAY_HELLO_AGAIN, responseObserver);
        }

        @Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            METHOD_SAY_HELLO,
                            ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            HelloWorldProto.HelloRequest,
                                            HelloWorldProto.HelloReply>(
                                            this, METHODID_SAY_HELLO)))
                    .addMethod(
                            METHOD_SAY_HELLO_AGAIN,
                            ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            HelloWorldProto.HelloRequest,
                                            HelloWorldProto.HelloReply>(
                                            this, METHODID_SAY_HELLO_AGAIN)))
                    .build();
        }

    }

    /**
     * <pre>
     * greeting服务定义
     * </pre>
     */
    public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {

        private GreeterStub(io.grpc.Channel channel) {
            super(channel);
        }

        private GreeterStub(io.grpc.Channel channel,
                            io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected GreeterStub build(io.grpc.Channel channel,
                                    io.grpc.CallOptions callOptions) {
            return new GreeterStub(channel, callOptions);
        }

        /**
         * <pre>
         * sayHello方法，格式为"方法名 请求参数 返回参数"
         * </pre>
         */
        public void sayHello(HelloWorldProto.HelloRequest request,
                             io.grpc.stub.StreamObserver<HelloWorldProto.HelloReply> responseObserver) {
            ClientCalls.asyncUnaryCall(
                    getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * 另一个sayHello方法
         * </pre>
         */
        public void sayHelloAgain(HelloWorldProto.HelloRequest request,
                                  io.grpc.stub.StreamObserver<HelloWorldProto.HelloReply> responseObserver) {
            ClientCalls.asyncUnaryCall(
                    getChannel().newCall(METHOD_SAY_HELLO_AGAIN, getCallOptions()), request, responseObserver);
        }

    }

    /**
     * <pre>
     * greeting服务定义
     * </pre>
     */
    public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {

        private GreeterBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private GreeterBlockingStub(io.grpc.Channel channel,
                                    io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected GreeterBlockingStub build(io.grpc.Channel channel,
                                            io.grpc.CallOptions callOptions) {
            return new GreeterBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * sayHello方法，格式为"方法名 请求参数 返回参数"
         * </pre>
         */
        public HelloWorldProto.HelloReply sayHello(HelloWorldProto.HelloRequest request) {
            return ClientCalls.blockingUnaryCall(
                    getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
        }

        /**
         * <pre>
         * 另一个sayHello方法
         * </pre>
         */
        public HelloWorldProto.HelloReply sayHelloAgain(HelloWorldProto.HelloRequest request) {
            return ClientCalls.blockingUnaryCall(
                    getChannel(), METHOD_SAY_HELLO_AGAIN, getCallOptions(), request);
        }

    }

    /**
     * <pre>
     * greeting服务定义
     * </pre>
     */
    public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {

        private GreeterFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private GreeterFutureStub(io.grpc.Channel channel,
                                  io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected GreeterFutureStub build(io.grpc.Channel channel,
                                          io.grpc.CallOptions callOptions) {
            return new GreeterFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * sayHello方法，格式为"方法名 请求参数 返回参数"
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<HelloWorldProto.HelloReply> sayHello(
                HelloWorldProto.HelloRequest request) {
            return ClientCalls.futureUnaryCall(
                    getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
        }

        /**
         * <pre>
         * 另一个sayHello方法
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<HelloWorldProto.HelloReply> sayHelloAgain(
                HelloWorldProto.HelloRequest request) {
            return ClientCalls.futureUnaryCall(
                    getChannel().newCall(METHOD_SAY_HELLO_AGAIN, getCallOptions()), request);
        }

    }

    private static final int METHODID_SAY_HELLO = 0;
    private static final int METHODID_SAY_HELLO_AGAIN = 1;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final GreeterImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SAY_HELLO:
                    serviceImpl.sayHello((HelloWorldProto.HelloRequest) request,
                            (io.grpc.stub.StreamObserver<HelloWorldProto.HelloReply>) responseObserver);
                    break;
                case METHODID_SAY_HELLO_AGAIN:
                    serviceImpl.sayHelloAgain((HelloWorldProto.HelloRequest) request,
                            (io.grpc.stub.StreamObserver<HelloWorldProto.HelloReply>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @Override
        @SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }

    }

    private static final class GreeterDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {

        @Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return HelloWorldProto.getDescriptor();
        }

    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (GreeterGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new GreeterDescriptorSupplier())
                            .addMethod(METHOD_SAY_HELLO)
                            .addMethod(METHOD_SAY_HELLO_AGAIN)
                            .build();
                }
            }
        }
        return result;
    }

}
