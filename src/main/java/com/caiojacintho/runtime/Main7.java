package com.caiojacintho.runtime;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Main7 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("dentro do IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("dentro do ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("dentro do RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException  | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
