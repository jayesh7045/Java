package Server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler2 implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        String output = "HTTPhandler2";
        exchange.sendResponseHeaders(200, output.length());

        OutputStream o = exchange.getResponseBody();
        o.write(output.getBytes());
        o.flush();
        o.close();


    }


}
