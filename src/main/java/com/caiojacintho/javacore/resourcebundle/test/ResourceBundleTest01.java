package com.caiojacintho.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundle1 = ResourceBundle.getBundle("message", new Locale("en", "US"));

        System.out.println(bundle1.getString("oi"));
        System.out.println(bundle1.getString("bom.dia"));



    }
}
