package ca.cutterslade.experiment.gdk

import dagger.grpc.server.NettyServerModule

fun main(args: Array<String>) {
  val component = DaggerGreeterComponent.builder()
      .nettyServerModule(NettyServerModule.bindingToPort(6000))
      .build()
  val server = component.server()
  server.start()
}
