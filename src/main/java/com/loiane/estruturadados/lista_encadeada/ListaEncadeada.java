package com.loiane.estruturadados.lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;
    private static final int NAO_ENCONTRADO = -1;

    public void adiciona(int posicao, T elemento) {
        if (posicaoNaoExiste(posicao)) throw new IllegalArgumentException("Posição inváida");

        if (posicao == 0) {
            this.adicionaInicio(elemento);
        } else if (posicao == tamanho) {
            this.adiciona(elemento);
        } else {
            No<T> noAnterior = this.buscaNo(posicao - 1);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);

            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);

        if (estaVazio()) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);

        if (estaVazio()) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public T remove(int posicao) {
        if (posicaoNaoExiste(posicao)) throw new IllegalArgumentException("Posição inváida");
        if(posicao == 0) return this.removeInicio();
        if (posicao == this.tamanho - 1) return removeFinal();

        No<T> noAnterior = this.buscaNo(posicao - 1);
        No<T> atual = noAnterior.getProximo();
        No<T> proximo = atual.getProximo();

        noAnterior.setProximo(proximo);
        T elemento = atual.getElemento();

        atual.setProximo(null);
        atual.setElemento(null);

        return elemento;
    }

    public T removeFinal() {
        if (estaVazio()) throw new RuntimeException("Lista está vazia.");
        if (this.tamanho == 1) return this.removeInicio();

        No<T> penultimoNo = this.buscaNo(this.tamanho - 2);
        No<T> noRemovido = penultimoNo.getProximo();

        this.ultimo = penultimoNo;
        penultimoNo.setProximo(null);

        T elementoRemovido = noRemovido.getElemento();
        noRemovido.setElemento(null);
        this.tamanho--;

        return elementoRemovido;
    }

    public T removeInicio() {
        if (estaVazio()) throw new RuntimeException("Lista está vazia.");

        T removido = this.inicio.getElemento();
        No<T> noRemovido = this.inicio;
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        noRemovido.setProximo(null);
        noRemovido.setElemento(null);

        if (estaVazio()) this.ultimo = null;
        return removido;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void limpa() {
        No<T> atual = inicio;
        while (atual.getProximo() != null) {
            No<T> proximo = atual.getProximo();

            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public T buscaPorPosicao(int posicao) {
        return buscaNo(posicao).getElemento();
    }

    private No<T> buscaNo(int posicao) {
        if (posicaoNaoExiste(posicao)) throw new IllegalArgumentException("Posição não existe");

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    public int busca(T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) return pos;

            pos++;
            noAtual = noAtual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

    private boolean posicaoNaoExiste(int posicao) {
        return (posicao < 0 || posicao >= tamanho);
    }

    @Override
    public String toString() {
        if (estaVazio()) return "[]";

        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.inicio;

        builder.append(atual.getElemento());

        while (atual.getProximo() != null) {
            builder.append(", ");
            atual = atual.getProximo();
            builder.append(atual.getElemento());
        }

        builder.append("]");
        return builder.toString();
    }
}
