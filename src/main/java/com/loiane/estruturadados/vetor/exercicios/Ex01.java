package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Vetor;

public class Ex01 {
    public static void main(String[] args) {
        Vetor<String> lista = new Vetor<>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("C"));
        System.out.println(lista.contem("E"));
    }
}
