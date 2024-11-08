package com.caiojacintho.javacore.Serializacao.test;

import com.caiojacintho.javacore.Serializacao.dominio.Aluno;
import com.caiojacintho.javacore.Serializacao.dominio.Turma;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(01L,"caio jacintho","12345");
        Aluno aluno1 = new Aluno(02L,"joana","9876");
        Turma turma = new Turma("turma do amor");
        aluno.setTurma(turma);
        serializar(aluno);
        //serializar(aluno1);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
