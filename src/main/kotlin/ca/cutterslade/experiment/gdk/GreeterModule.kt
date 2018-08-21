package ca.cutterslade.experiment.gdk

import dagger.Module
import dagger.Provides
import dagger.grpc.server.ForGrpcService
import io.grpc.ServerInterceptor

@Module
class GreeterModule {
  @Provides
  fun greeterComponent(component: GreeterComponent): GreeterServiceDefinition = component

  @Provides
  @ForGrpcService(GreeterGrpc::class)
  fun interceptors(): List<ServerInterceptor> = listOf()
}
