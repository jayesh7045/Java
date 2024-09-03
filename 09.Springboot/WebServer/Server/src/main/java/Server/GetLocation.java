package Server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class GetLocation implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String str = "Location data will be shown very soon...";
        exchange.sendResponseHeaders(200, str.length());
        OutputStream o = exchange.getResponseBody();
        o.write(str.getBytes());
        o.flush();
        o.close();
    }
}
