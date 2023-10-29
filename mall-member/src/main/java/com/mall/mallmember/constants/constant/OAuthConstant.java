package com.mall.mallmember.constants.constant;

public interface OAuthConstant {
    interface Roles {
        String USER = "user";
        String ADMIN = "admin";
        String COMPANY = "company";
    }

    interface Permissions {
        String SELECT = "select";
        String INSERT = "insert";
        String UPDATE = "update";
        String DELETE = "delete";
    }

    interface Code {
        int OK = 200;
        int UNAUTHENTICATED = 401;
        int UNAUTHORIZED = 403;
        int NOT_FOUND = 404;
        int SERVER_ERROR = 500;

        int BUSINESS_ERROR = 600;
    }

    interface Password {
        String PASSWORD ="313a33e3a78dae45e8a274e4043a0e15a6a089d4777be74a865f577f02b6a1ef";
    }
}
