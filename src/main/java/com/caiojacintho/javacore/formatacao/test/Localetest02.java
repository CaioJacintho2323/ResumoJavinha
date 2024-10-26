package com.caiojacintho.javacore.formatacao.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

public class Localetest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }

        System.out.println();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
    }
}
