package com.caiojacintho.javacore.padroesdeprojeto.test;

import com.caiojacintho.javacore.padroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRASIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder()
                .FirstName("Caio")
                .LastName("Jacintho")
                .build();
        ReportoDto reportDto = ReportoDto.ReportoDtoBuilder
                .builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName() + " " + person.getLastName())
                .build();

        System.out.println(reportDto);

    }
}
