package com.loiane.estruturadados.lista.teste;

import com.loiane.estruturadados.lista.Lista;

public class Aula06 {
    public static void main(String[] args) {
        Lista lista = new Lista(10);
        lista.adicionar("elemento 1");
        lista.adicionar("elemento 2");
        lista.adicionar("elemento 3");

        System.out.println(lista.busca("elemento 1"));
        System.out.println(lista.busca("elemento 3"));
        System.out.println(lista.busca("elemento 5"));
    }
}
