package com.caiojacintho.javacore.colecoes.dominio;

import java.util.Objects;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
       if(o == null) return false;
       if(this == o) return true;
       if(this.getClass() != o.getClass()) return false;
       Smartphone smartphone = (Smartphone) o;
       return serialNumber != null & serialNumber.equals(smartphone.serialNumber);
    }



    @Override
    public int hashCode() {
        return Objects.hashCode(serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
