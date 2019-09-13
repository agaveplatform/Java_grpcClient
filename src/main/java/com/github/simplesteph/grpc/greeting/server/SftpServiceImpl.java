package com.github.simplesteph.grpc.greeting.server;

import com.proto.SftpPb.*;
import io.grpc.stub.StreamObserver;

public class SftpServiceImpl  extends SFTPGrpc.SFTPImplBase {

    @Override
    public void copyLocalToRemoteService(CopyLocalToRemoteRequest request, StreamObserver<CopyLocalToRemoteResponse> responseObserver) {
        super.copyLocalToRemoteService(request, responseObserver);

        Sftp sftp = request.getSftp();
        String user = sftp.getUsername();
        String pwd = sftp.getPassWord();
        String port = sftp.getHostPort();
        String system = sftp.getSystemId();

        String result = "file coppied";
        CopyLocalToRemoteResponse response = CopyLocalToRemoteResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }
}
