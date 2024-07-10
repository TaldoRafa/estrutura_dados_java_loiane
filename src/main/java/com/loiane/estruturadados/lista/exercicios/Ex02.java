package com.loiane.estruturadados.lista.exercicios;

import com.loiane.estruturadados.lista.Lista;

public class Ex02 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");

        System.out.println(lista.ultimoIndice("A"));
        System.out.println(lista.ultimoIndice("C"));
        System.out.println(lista.ultimoIndice("E"));
    }
}
