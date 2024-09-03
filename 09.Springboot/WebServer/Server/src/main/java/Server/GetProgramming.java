package Server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class GetProgramming implements HttpHandler {
    @Override
    public  void handle(HttpExchange exchange) throws IOException {
        String res = "This will return you the programming language data...";
        exchange.sendResponseHeaders(200, res.length());
        OutputStream o = exchange.getResponseBody();
        o.write(res.getBytes());
        o.flush();
        o.close();


    }
}
