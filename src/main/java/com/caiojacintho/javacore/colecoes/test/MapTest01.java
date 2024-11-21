package com.caiojacintho.javacore.colecoes.test;

import com.caiojacintho.javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //Map<String,String> map = new HashMap<>();
        Map<String,String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.putIfAbsent("vc", "voce");

        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("---------------");

        for (String values : map.values()){
            System.out.println(values);
        }

        System.out.println("---------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
