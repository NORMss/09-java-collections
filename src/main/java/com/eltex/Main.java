package com.eltex;

import com.eltex.data.UserResponse;
import com.eltex.data.UserService;

public class Main {
    public static void main(String[] args) {
        final var userService = new UserService();

        userService.save(new UserResponse(0, "normno", "Sergey", "https://normno.ru/image/norm_logo.svg"));
        userService.save(new UserResponse(0, "diankaD78", "Diana", null));
        userService.save(new UserResponse(0, "lllallke", "Egor", null));

        System.out.println(userService.getAll());

        userService.save(new UserResponse(2, "dipanick", "Diana", null));

        System.out.println(userService.getById(2));

        try {
            System.out.println(userService.getById(-1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        userService.removeById(2);

        System.out.println(userService.getAll());
    }
}