package com.github.simplesteph.grpc.greeting.client;

import com.proto.SftpPb.*;
import com.proto.greet.Greet.*;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {

    public static void main(String[] args) {
        System.out.println("hello client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        SFTPGrpc.SFTPBlockingStub sftpClient = SFTPGrpc.newBlockingStub(channel);
        Sftp sftp = Sftp.newBuilder()
                .setUsername("foo")
                .setPassWord("123")
                .setSystemId("192.168.1.14")
                .setHostPort(":2225")
                .setFileName("test2.txt")
                .build();
        CopyFromRemoteRequest copyFileRequest = CopyFromRemoteRequest.newBuilder()
                .setSftp(sftp)
                .build();
        System.out.println("hello client 1");

        CopyFromRemoteResponse copyResponse = sftpClient.copyFromRemoteService(copyFileRequest);
        System.out.println("hello client 2");

        System.out.println(copyResponse.getResult());

        //syncClient.
        System.out.println("Shutdown the client");
        channel.shutdown();

    }
}
