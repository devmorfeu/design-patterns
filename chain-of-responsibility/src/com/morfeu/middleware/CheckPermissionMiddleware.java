package com.morfeu.middleware;

public class CheckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@admin.com")) {
            System.out.println("ACESSO ADMIN OK");
            return true;
        }
        System.out.println("ACESSO USUARIO OK");
        return checkNext(email, password);
    }
}
