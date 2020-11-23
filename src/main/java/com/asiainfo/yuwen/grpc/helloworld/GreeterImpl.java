package com.asiainfo.yuwen.grpc.helloworld;

import com.asiainfo.yuwen.grpc.helloworld.HelloWorldProto.HelloReply;
import com.asiainfo.yuwen.grpc.helloworld.HelloWorldProto.HelloRequest;
import io.grpc.stub.StreamObserver;

/**
 * <pre>
 * greeting服务实现类
 * </pre>
 */
public class GreeterImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        System.out.println("received message: [" + req.getName() + "]");
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHelloAgain(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello again " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}