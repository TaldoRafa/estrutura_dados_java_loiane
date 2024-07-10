package com.loiane.estruturadados.lista.exercicios;

import com.loiane.estruturadados.lista.Lista;

public class Ex04 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");
        lista.adicionar("E");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));
    }
}
