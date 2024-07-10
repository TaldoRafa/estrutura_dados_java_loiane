package com.loiane.estruturadados.lista_encadeada.teste;

import com.loiane.estruturadados.lista_encadeada.ListaEncadeada;

import java.util.LinkedList;

public class ListaEncadeadaTest01 {
    public static void main(String[] args) {
        testeLinkedList();
    }

    private static void testeLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.addFirst(0);
        list.addLast(3);
        list.add(2, 2);
        list.add(4);
        list.add(5);

        System.out.println(list);

        System.out.println(list.remove());
        System.out.println(list.remove(1));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
    }

    private static void removePosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);

        System.out.println(lista.remove(4));
        System.out.println(lista);
        System.out.println(lista.remove(1));
        System.out.println(lista);
    }

    private static void removeFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        System.out.println(lista);

        System.out.println(lista.removeFinal());
        System.out.println(lista);
        System.out.println(lista.removeFinal());
        System.out.println(lista);
        System.out.println(lista.removeFinal());
        System.out.println(lista);
    }

    private static void removeInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        System.out.println(lista);

        System.out.println(lista.removeInicio());
        System.out.println(lista);
        System.out.println(lista.removeInicio());
        System.out.println(lista);
    }

    private static void adicionaInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }

    private static void adicionaPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);
        lista.adiciona(0, 0);
        lista.adiciona(4, 5);
        lista.adiciona(3, 3);

        System.out.println(lista);
    }

    private static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println(lista);
        System.out.println("Tamanho: " + lista.getTamanho());

        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        System.out.println(lista);

        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));

        System.out.println("----------");

        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(3));
    }
}
