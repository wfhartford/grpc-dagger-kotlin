package ca.cutterslade.experiment.gdk

import dagger.grpc.server.GrpcService
import io.grpc.stub.StreamObserver

@GrpcService(grpcClass = GreeterGrpc::class)
class Greeter : GreeterGrpc.GreeterImplBase() {
  override fun sayHello(request: HelloRequest, responseObserver: StreamObserver<HelloReply>) {
    val reply = HelloReply.newBuilder().setMessage("Hello ${request.name}").build()
    responseObserver.onNext(reply)
    responseObserver.onCompleted()
  }

  override fun sayHelloAgain(request: HelloRequest, responseObserver: StreamObserver<HelloReply>) {
    val reply = HelloReply.newBuilder().setMessage("Hello again ${request.name}").build()
    responseObserver.onNext(reply)
    responseObserver.onCompleted()
  }
}
