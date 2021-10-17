package com.morfeu;

import com.morfeu.middleware.CheckPermissionMiddleware;
import com.morfeu.middleware.CheckUserMiddleware;
import com.morfeu.middleware.Middleware;
import com.morfeu.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Server server;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void init(){
        server = new Server();
        server.registerUser("admin@admin.com", "sidpv23@3nwd");
        server.registerUser("user@user.com", "123456");

        var middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {

        init();

        boolean done;

        do {
            System.out.println("DIGITE O EMAIL: ");
            var email = reader.readLine();
            System.out.println("DIGITE A SENHA: ");
            var password = reader.readLine();
            done = server.login(email, password);
        }while (!done);
    }
}
