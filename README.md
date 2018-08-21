# grpc-dagger-kotlin
Simple project using gRPC, dagger, and kotlin.

The main purpose of this repository is to illustrate my inability to get the [dagger-grpc](https://google.github.io/dagger/grpc/servers) extension to work with kapt. There are several branches that all show a different failed attempt. All branches starting with `kotlin-` have all code in kotlin, with various interpretations of the basic hello world gRPC project, none of which compile. The `java-module-component` branch compiles, but fails to run with an `AbstractMethodError`. 

If anyone viewing this project knows how to get it to work, I would love a pull request.
