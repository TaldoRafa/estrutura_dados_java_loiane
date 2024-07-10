package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println(decimalBinario(2));
        System.out.println(decimalBinario(4));
        System.out.println(decimalBinario(10));
        System.out.println(decimalBinario(25));
        System.out.println(decimalBinario(10035));

        System.out.println("----------------------");

        System.out.println(decimalQualquerBase(25, 16));
        System.out.println(decimalQualquerBase(10035, 8));
        System.out.println(decimalQualquerBase(10035, 16));
    }

    private static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        StringBuffer numBinario = new StringBuffer();
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()) {
            numBinario.append(pilha.pop());
        }

        return numBinario.toString();
    }

    private static String decimalQualquerBase(int numero, int base) {
        if (base > 16) throw new IllegalArgumentException("A base deve ser menor ou igual a 16");

        Stack<Integer> pilha = new Stack<>();
        StringBuffer numBase = new StringBuffer();
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()) {
            numBase.append(bases.charAt(pilha.pop()));
        }

        return numBase.toString();
    }
}
