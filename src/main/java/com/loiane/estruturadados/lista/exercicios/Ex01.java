package com.loiane.estruturadados.lista.exercicios;

import com.loiane.estruturadados.lista.Lista;

public class Ex01 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("C"));
        System.out.println(lista.contem("E"));
    }
}
