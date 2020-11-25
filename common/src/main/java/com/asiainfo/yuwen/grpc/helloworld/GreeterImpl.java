package com.asiainfo.yuwen.grpc.helloworld;

import io.grpc.stub.StreamObserver;

/**
 * <pre>
 * greeting服务实现类
 * </pre>
 */
public class GreeterImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloWorldProto.HelloRequest req, StreamObserver<HelloWorldProto.HelloReply> responseObserver) {
        System.out.println("received message: [" + req.getName() + "]");
        HelloWorldProto.HelloReply reply = HelloWorldProto.HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHelloAgain(HelloWorldProto.HelloRequest req, StreamObserver<HelloWorldProto.HelloReply> responseObserver) {
        HelloWorldProto.HelloReply reply = HelloWorldProto.HelloReply.newBuilder().setMessage("Hello again " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}