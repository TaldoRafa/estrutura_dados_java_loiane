package com.loiane.estruturadados.lista;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {
    public Lista2() {}

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public boolean adicionar(T elemento) {
        return super.adicionar(elemento);
    }

    public boolean adicionar(int posicao, T elemento) {
        return super.adicionar(posicao, elemento);
    }

    public int busca(T elemento) {
        for (int i = 0; i < tamanho; i++)
            if (elementos[i].equals(elemento)) return i;
        return -1;
    }

    public void remove(int posicao) {
        if (isNotValidPosition(posicao)) throw new IllegalArgumentException("Posição inválida");
        for (int i = posicao; i < tamanho - 1; i++) elementos[i] = elementos[i + 1];
        tamanho--;
    }

    public void remove(T elemento) {
        int pos = busca(elemento);
        if (pos > -1) remove(pos);
    }
}
