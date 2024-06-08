package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Vetor;

public class Ex04 {
    public static void main(String[] args) {
        Vetor<String> vetor = new Vetor<>(5);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");

        System.out.println(vetor.obtem(0));
        System.out.println(vetor.obtem(2));
        System.out.println(vetor.obtem(4));
    }
}
