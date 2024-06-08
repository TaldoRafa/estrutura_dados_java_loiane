package com.loiane.estruturadados.vetor;

public class Vetor<T> {
    private T[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Vetor() {
        this(10);
    }

    public boolean adicionar(T elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho++] = elemento;
            return true;
        }
        return false;
    }

    public boolean adicionar(int posicao, T elemento) {
        if (isNotValidPosition(posicao)) throw new IllegalArgumentException("Posição inválida");

        aumentaCapacidade();

        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;

        return true;
    }

    private void aumentaCapacidade() {
        if (!(tamanho == elementos.length)) return;

        T[] elementosNovos = (T[]) new Object[elementos.length * 2];
        for (int i = 0; i < tamanho; i++) {
            elementosNovos[i] = elementos[i];
        }
        elementos = elementosNovos;
    }

    public T busca(int posicao) {
        if (isNotValidPosition(posicao)) throw new IllegalArgumentException("Posição inválida");
        return elementos[posicao];
    }

    public boolean contem(T elemento) {
        return busca(elemento) > -1;
    }

    public int busca(T elemento) {
        for (int i = 0; i < tamanho; i++)
            if (elementos[i].equals(elemento)) return i;
        return -1;
    }

    public int ultimoIndice(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--)
            if (elementos[i].equals(elemento)) return i;
        return -1;
    }

    public T obtem(int posicao) {
        if (isNotValidPosition(posicao))
            throw new IllegalArgumentException("Posição: " + posicao + ", Tamanho: " + tamanho);
        return elementos[posicao];
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

    public void limpar() {
        tamanho = 0;
    }

    private boolean isNotValidPosition(int posicao) {
        return !(posicao >= 0 && posicao < tamanho);
    }

    public int tamanho() {
        return tamanho;
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
