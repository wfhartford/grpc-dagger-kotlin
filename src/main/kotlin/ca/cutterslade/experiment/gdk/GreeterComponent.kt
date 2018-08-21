package ca.cutterslade.experiment.gdk

import dagger.Component
import dagger.grpc.server.NettyServerModule
import io.grpc.Server
import javax.inject.Singleton

@Singleton
@Component(modules = [
  NettyServerModule::class,
  GreeterUnscopedGrpcServiceModule::class,
  GreeterModule::class
])
interface GreeterComponent : GreeterServiceDefinition {
  fun server(): Server
}
