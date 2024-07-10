package com.loiane.estruturadados.lista.teste;

import com.loiane.estruturadados.lista.Lista;

public class Aula09 {
    public static void main(String[] args) {
        Lista lista = new Lista(3);

        lista.adicionar("B");
        lista.adicionar("G");
        lista.adicionar("D");
        lista.adicionar("E");
        lista.adicionar("F");

        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);

        System.out.println("Remover o elemento E");
        int posicao = lista.busca("E");
        if (posicao > -1) {
            lista.remove(posicao);
        }
        System.out.println(lista);
    }
}
