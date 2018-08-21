import com.google.protobuf.gradle.GenerateProtoTask

repositories { jcenter() }

plugins {
  idea
  kotlin("jvm") version "1.2.61"
  kotlin("kapt") version "1.2.61"
  id("com.google.protobuf") version "0.8.6"
}

group = "ca.cutterslade.experiment"

dependencies {
  compile(kotlin("stdlib-jdk8"))
  compile("com.google.dagger:dagger:2.17")
  compile("com.google.dagger:dagger-grpc-server:2.17")
  compile("com.google.protobuf:protobuf-java:3.6.1")
  compile("io.grpc:grpc-stub:1.14.0")
  compile("io.grpc:grpc-protobuf:1.14.0")
  compile("javax.annotation:javax.annotation-api:1.3.2")

  kapt("com.google.dagger:dagger-compiler:2.17")
  kapt("com.google.dagger:dagger-grpc-server-processor:2.17")

}

protobuf {
  withGroovyBuilder {
    "protobuf" {
      "protoc" {
        "setArtifact"("com.google.protobuf:protoc:3.6.1")
      }
      "plugins" {
        "create"("grpc-java") {
          "setArtifact"("io.grpc:protoc-gen-grpc-java:1.14.0")
        }
      }
    }
  }
  tasks.withType<GenerateProtoTask> {
    plugins.create("grpc-java")
  }
}
