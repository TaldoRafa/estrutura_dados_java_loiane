package com.loiane.estruturadados.pilha.test;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i < 15; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
