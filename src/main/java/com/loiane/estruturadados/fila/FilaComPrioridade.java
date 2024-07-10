package com.loiane.estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T> {
    @Override
    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i = 0;
        for (i = 0; i < tamanho; i++) if (chave.compareTo(this.elementos[i]) < 0) break;
        this.adicionar(i, elemento);
    }
}
