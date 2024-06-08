package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Vetor;

public class Ex02 {
    public static void main(String[] args) {
        Vetor<String> lista = new Vetor<>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");

        System.out.println(lista.ultimoIndice("A"));
        System.out.println(lista.ultimoIndice("C"));
        System.out.println(lista.ultimoIndice("E"));
    }
}
