package com.loiane.estruturadados.lista.teste;

import com.loiane.estruturadados.lista.Lista;

public class Aula07 {
    public static void main(String[] args) {
        Lista lista = new Lista(10);

        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("E");
        lista.adicionar("F");
        lista.adicionar("G");

        System.out.println(lista);

        lista.adicionar(0, "A");
        System.out.println(lista);

        lista.adicionar(3, "D");
        System.out.println(lista);
    }
}
