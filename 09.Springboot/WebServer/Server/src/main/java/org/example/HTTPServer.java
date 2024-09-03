package org.example;

import Server.GetLocation;
import Server.GetProgramming;
import Server.HelloHandler;

import Server.HelloHandler2;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HTTPServer {
    public static void main(String[] args) throws IOException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("localhost", 9092);
        HttpServer httpServer = HttpServer.create(inetSocketAddress, 0);
/*
        httpServer.setExecutor(Executors.newFixedThreadPool(4));
*/
        httpServer.createContext("/api/getlocationdata", new GetLocation());
        httpServer.createContext("/api/getprogramming", new GetProgramming());
        httpServer.start();
/*

*/
    }
}
