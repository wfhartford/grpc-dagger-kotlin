package ca.cutterslade.experiment.gdk

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.grpc.server.ForGrpcService
import io.grpc.ServerInterceptor

@Module
abstract class GreeterModule {
  @Binds
  abstract fun greeterComponent(component: GreeterComponent): GreeterServiceDefinition

  companion object {
    @Provides
    @ForGrpcService(GreeterGrpc::class)
    @JvmStatic
    fun interceptors(): List<ServerInterceptor> = listOf()
  }
}
