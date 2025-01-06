package com.caiojacintho.javacore.concorrencia.dominio;



public class Discount {
    public enum Code{
        NONE(0),
        DESCONTIN(5),
        DESCONTIN2(5),
        DESCONTAO(15);

        private final int porcentagem;
        Code(int porcentagem){
            this.porcentagem = porcentagem;
        }
        public int getPorcentagem() {
            return porcentagem;
        }
    }
}
