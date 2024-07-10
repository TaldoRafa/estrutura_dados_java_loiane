package com.loiane.estruturadados.lista.teste;

import com.loiane.estruturadados.lista.Lista;

public class Aula11 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(1);

        lista.adicionar("Elemento 1");
        lista.adicionar("Elemento 2");

        System.out.println(lista);
    }
}
