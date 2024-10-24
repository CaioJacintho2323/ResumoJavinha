package com.caiojacintho.exception;

import com.caiojacintho.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "admin";
        String passwordDB = "123";
        System.out.println("Usuario:");
        String username = scanner.nextLine();
        System.out.println("Senha:");
        String password = scanner.nextLine();
        if (!usernameDB.equals(username) || !passwordDB.equals(password)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos ");
        }
        System.out.println("usuario logado!");
    }
}
