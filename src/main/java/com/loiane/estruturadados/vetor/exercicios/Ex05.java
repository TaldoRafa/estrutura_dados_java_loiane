package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Vetor;

public class Ex05 {
    public static void main(String[] args) {
        Vetor<String> vetor = new Vetor<>(5);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");

        System.out.println(vetor);
        vetor.limpar();
        System.out.println(vetor);

    }
}
