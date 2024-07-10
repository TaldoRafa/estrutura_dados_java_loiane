package com.loiane.estruturadados.lista.teste;

import com.loiane.estruturadados.lista.Lista;

public class Aula08 {
    public static void main(String[] args) {
        Lista lista = new Lista(3);

        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("E");
        lista.adicionar("F");
        lista.adicionar("G");

        System.out.println(lista);
    }
}
