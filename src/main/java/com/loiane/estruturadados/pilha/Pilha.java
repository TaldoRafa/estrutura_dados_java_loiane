package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
    }

    public void empilha(T elemento) {
        super.adicionar(elemento);
    }

    public T topo() {
        if (estaVazia()) return null;
        return elementos[tamanho - 1];
    }

    public T desempilha() {
        if (estaVazia()) return null;
        return elementos[--tamanho];
    }
}
