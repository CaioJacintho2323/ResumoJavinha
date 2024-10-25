package com.caiojacintho.javacore.allexception.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("fechando leitor 1");
    }
}
