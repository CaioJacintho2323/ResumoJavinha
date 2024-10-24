package com.caiojacintho.exception;

import com.caiojacintho.exception.dominio.Funcionario;
import com.caiojacintho.exception.dominio.LoginInvalidoException;
import com.caiojacintho.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaComException {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();

        try {
            f.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
