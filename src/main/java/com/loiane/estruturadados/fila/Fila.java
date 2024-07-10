package com.loiane.estruturadados.fila;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfileira(T elemento) {
        this.adicionar(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) return null;
        return this.elementos[0];
    }

    public T desenfileira() {
        if (this.estaVazia()) return null;

        T elementoASerRemovido = this.elementos[0];
        this.remove(0);

        return elementoASerRemovido;
    }
}
