package ca.cutterslade.experiment.gdk;

import javax.inject.Singleton;

import dagger.Component;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;

@Singleton
@Component(modules = {
    NettyServerModule.class,
    GreeterUnscopedGrpcServiceModule.class,
    GreeterModule.class
})
public interface GreeterComponent extends GreeterServiceDefinition {
  Server server();
}
