package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula11 {
    public static void main(String[] args) {
        Vetor<String> vetor = new Vetor<>(1);

        vetor.adicionar("Elemento 1");
        vetor.adicionar("Elemento 2");

        System.out.println(vetor);
    }
}
