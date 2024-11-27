package com.caiojacintho.javacore.generics.test;
abstract class animal{
    public abstract void consulta();
}
class cachorro extends animal{
    @Override
    public void consulta() {
        System.out.println("consultando o cachorro");
    }
}
class gato extends animal{

    @Override
    public void consulta() {
        System.out.println("consultando o gato");
    }
}
public class WildcarTest01 {
    public static void main(String[] args) {
        cachorro [] cachorros = {new cachorro(), new cachorro()};
        gato [] gatos = {new gato(), new gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
    }
    private static void printConsulta(animal[] animals) {
        for (animal animal : animals) {
            animal.consulta();
        }
    }
}
