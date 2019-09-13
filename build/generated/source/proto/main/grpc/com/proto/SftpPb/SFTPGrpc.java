package com.proto.SftpPb;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: SftpPb/sftp.proto")
public final class SFTPGrpc {

  private SFTPGrpc() {}

  public static final String SERVICE_NAME = "sftp.SFTP";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.SftpPb.CopyFromRemoteRequest,
      com.proto.SftpPb.CopyFromRemoteResponse> getCopyFromRemoteServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyFromRemoteService",
      requestType = com.proto.SftpPb.CopyFromRemoteRequest.class,
      responseType = com.proto.SftpPb.CopyFromRemoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.SftpPb.CopyFromRemoteRequest,
      com.proto.SftpPb.CopyFromRemoteResponse> getCopyFromRemoteServiceMethod() {
    io.grpc.MethodDescriptor<com.proto.SftpPb.CopyFromRemoteRequest, com.proto.SftpPb.CopyFromRemoteResponse> getCopyFromRemoteServiceMethod;
    if ((getCopyFromRemoteServiceMethod = SFTPGrpc.getCopyFromRemoteServiceMethod) == null) {
      synchronized (SFTPGrpc.class) {
        if ((getCopyFromRemoteServiceMethod = SFTPGrpc.getCopyFromRemoteServiceMethod) == null) {
          SFTPGrpc.getCopyFromRemoteServiceMethod = getCopyFromRemoteServiceMethod =
              io.grpc.MethodDescriptor.<com.proto.SftpPb.CopyFromRemoteRequest, com.proto.SftpPb.CopyFromRemoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyFromRemoteService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.SftpPb.CopyFromRemoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.SftpPb.CopyFromRemoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SFTPMethodDescriptorSupplier("CopyFromRemoteService"))
              .build();
        }
      }
    }
    return getCopyFromRemoteServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.SftpPb.CopyLocalToRemoteRequest,
      com.proto.SftpPb.CopyLocalToRemoteResponse> getCopyLocalToRemoteServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyLocalToRemoteService",
      requestType = com.proto.SftpPb.CopyLocalToRemoteRequest.class,
      responseType = com.proto.SftpPb.CopyLocalToRemoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.SftpPb.CopyLocalToRemoteRequest,
      com.proto.SftpPb.CopyLocalToRemoteResponse> getCopyLocalToRemoteServiceMethod() {
    io.grpc.MethodDescriptor<com.proto.SftpPb.CopyLocalToRemoteRequest, com.proto.SftpPb.CopyLocalToRemoteResponse> getCopyLocalToRemoteServiceMethod;
    if ((getCopyLocalToRemoteServiceMethod = SFTPGrpc.getCopyLocalToRemoteServiceMethod) == null) {
      synchronized (SFTPGrpc.class) {
        if ((getCopyLocalToRemoteServiceMethod = SFTPGrpc.getCopyLocalToRemoteServiceMethod) == null) {
          SFTPGrpc.getCopyLocalToRemoteServiceMethod = getCopyLocalToRemoteServiceMethod =
              io.grpc.MethodDescriptor.<com.proto.SftpPb.CopyLocalToRemoteRequest, com.proto.SftpPb.CopyLocalToRemoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyLocalToRemoteService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.SftpPb.CopyLocalToRemoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.SftpPb.CopyLocalToRemoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SFTPMethodDescriptorSupplier("CopyLocalToRemoteService"))
              .build();
        }
      }
    }
    return getCopyLocalToRemoteServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SFTPStub newStub(io.grpc.Channel channel) {
    return new SFTPStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SFTPBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SFTPBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SFTPFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SFTPFutureStub(channel);
  }

  /**
   */
  public static abstract class SFTPImplBase implements io.grpc.BindableService {

    /**
     */
    public void copyFromRemoteService(com.proto.SftpPb.CopyFromRemoteRequest request,
        io.grpc.stub.StreamObserver<com.proto.SftpPb.CopyFromRemoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCopyFromRemoteServiceMethod(), responseObserver);
    }

    /**
     */
    public void copyLocalToRemoteService(com.proto.SftpPb.CopyLocalToRemoteRequest request,
        io.grpc.stub.StreamObserver<com.proto.SftpPb.CopyLocalToRemoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCopyLocalToRemoteServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCopyFromRemoteServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.SftpPb.CopyFromRemoteRequest,
                com.proto.SftpPb.CopyFromRemoteResponse>(
                  this, METHODID_COPY_FROM_REMOTE_SERVICE)))
          .addMethod(
            getCopyLocalToRemoteServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.SftpPb.CopyLocalToRemoteRequest,
                com.proto.SftpPb.CopyLocalToRemoteResponse>(
                  this, METHODID_COPY_LOCAL_TO_REMOTE_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class SFTPStub extends io.grpc.stub.AbstractStub<SFTPStub> {
    private SFTPStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SFTPStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SFTPStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SFTPStub(channel, callOptions);
    }

    /**
     */
    public void copyFromRemoteService(com.proto.SftpPb.CopyFromRemoteRequest request,
        io.grpc.stub.StreamObserver<com.proto.SftpPb.CopyFromRemoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCopyFromRemoteServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copyLocalToRemoteService(com.proto.SftpPb.CopyLocalToRemoteRequest request,
        io.grpc.stub.StreamObserver<com.proto.SftpPb.CopyLocalToRemoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCopyLocalToRemoteServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SFTPBlockingStub extends io.grpc.stub.AbstractStub<SFTPBlockingStub> {
    private SFTPBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SFTPBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SFTPBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SFTPBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.SftpPb.CopyFromRemoteResponse copyFromRemoteService(com.proto.SftpPb.CopyFromRemoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getCopyFromRemoteServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.SftpPb.CopyLocalToRemoteResponse copyLocalToRemoteService(com.proto.SftpPb.CopyLocalToRemoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getCopyLocalToRemoteServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SFTPFutureStub extends io.grpc.stub.AbstractStub<SFTPFutureStub> {
    private SFTPFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SFTPFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SFTPFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SFTPFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.SftpPb.CopyFromRemoteResponse> copyFromRemoteService(
        com.proto.SftpPb.CopyFromRemoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCopyFromRemoteServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.SftpPb.CopyLocalToRemoteResponse> copyLocalToRemoteService(
        com.proto.SftpPb.CopyLocalToRemoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCopyLocalToRemoteServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COPY_FROM_REMOTE_SERVICE = 0;
  private static final int METHODID_COPY_LOCAL_TO_REMOTE_SERVICE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SFTPImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SFTPImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COPY_FROM_REMOTE_SERVICE:
          serviceImpl.copyFromRemoteService((com.proto.SftpPb.CopyFromRemoteRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.SftpPb.CopyFromRemoteResponse>) responseObserver);
          break;
        case METHODID_COPY_LOCAL_TO_REMOTE_SERVICE:
          serviceImpl.copyLocalToRemoteService((com.proto.SftpPb.CopyLocalToRemoteRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.SftpPb.CopyLocalToRemoteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SFTPBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SFTPBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.SftpPb.SftpOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SFTP");
    }
  }

  private static final class SFTPFileDescriptorSupplier
      extends SFTPBaseDescriptorSupplier {
    SFTPFileDescriptorSupplier() {}
  }

  private static final class SFTPMethodDescriptorSupplier
      extends SFTPBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SFTPMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SFTPGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SFTPFileDescriptorSupplier())
              .addMethod(getCopyFromRemoteServiceMethod())
              .addMethod(getCopyLocalToRemoteServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
