package com.loiane.estruturadados.base;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    protected boolean adicionar(T elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho++] = elemento;
            return true;
        }
        return false;
    }

    protected boolean adicionar(int posicao, T elemento) {
        if (isNotValidPosition(posicao)) throw new IllegalArgumentException("Posição inválida");

        aumentaCapacidade();

        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;

        return true;
    }

    protected void remove(int posicao){
        if (isNotValidPosition(posicao)) throw new IllegalArgumentException("Posição inválida");
        for (int i=posicao; i<tamanho-1; i++) elementos[i] = elementos[i+1];
        tamanho--;
    }

    protected void aumentaCapacidade() {
        if (!(tamanho == elementos.length)) return;

        T[] elementosNovos = (T[]) new Object[elementos.length * 2];
        for (int i = 0; i < tamanho; i++) {
            elementosNovos[i] = elementos[i];
        }
        elementos = elementosNovos;
    }

    protected boolean isNotValidPosition(int posicao) {
        return !(posicao >= 0 && posicao <= tamanho);
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < tamanho - 1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }
        if (tamanho > 0) {
            s.append(elementos[tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}
