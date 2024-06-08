package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;
import java.util.List;

public class Aula12 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);
        System.out.println(arrayList.lastIndexOf("B"));

        boolean exist = arrayList.contains("A");
        if (exist) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }

        int posicao = arrayList.indexOf("B");
        if (posicao > -1) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("B");
        System.out.println(arrayList);

        System.out.println(arrayList.size());
    }
}
