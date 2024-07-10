package com.loiane.estruturadados.lista.exercicios;

import com.loiane.estruturadados.lista.Lista;

public class Ex03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");
        lista.adicionar("E");

        System.out.println(lista);

        lista.remove("A");
        System.out.println(lista);

        lista.remove("E");
        System.out.println(lista);

        lista.remove("C");
        System.out.println(lista);
    }
}
