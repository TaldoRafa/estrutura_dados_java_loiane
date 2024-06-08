package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("G");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        System.out.println(vetor);
        vetor.remove(1);
        System.out.println(vetor);

        System.out.println("Remover o elemento E");
        int posicao = vetor.busca("E");
        if (posicao > -1) {
            vetor.remove(posicao);
        }
        System.out.println(vetor);
    }
}
