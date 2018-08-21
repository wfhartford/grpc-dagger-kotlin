package ca.cutterslade.experiment.gdk;

import java.util.Collections;
import java.util.List;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.ForGrpcService;
import io.grpc.ServerInterceptor;

@Module
public abstract class GreeterModule {
  @Binds
  public abstract GreeterServiceDefinition greeterComponent(GreeterComponent component);

  @Provides
  @ForGrpcService(GreeterGrpc.class)
  public static List<? extends ServerInterceptor> interceptors() {
    return Collections.emptyList();
  }
}
