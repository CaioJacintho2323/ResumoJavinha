package com.caiojacintho.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
