package com.morfeu.middleware;

import com.morfeu.server.Server;

public class CheckUserMiddleware extends Middleware{

    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }


    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)){
            System.out.println("EMAIL INVALIDO");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("EMAIL OU SENHA INVALIDOS");
            return false;
        }

        return checkNext(email, password);
    }
}
