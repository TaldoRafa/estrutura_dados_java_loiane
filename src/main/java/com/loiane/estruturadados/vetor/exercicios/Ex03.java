package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Vetor;

public class Ex03 {
    public static void main(String[] args) {
        Vetor<String> vetor = new Vetor<>(5);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");

        System.out.println(vetor);

        vetor.remove("A");
        System.out.println(vetor);

        vetor.remove("E");
        System.out.println(vetor);

        vetor.remove("C");
        System.out.println(vetor);
    }
}
