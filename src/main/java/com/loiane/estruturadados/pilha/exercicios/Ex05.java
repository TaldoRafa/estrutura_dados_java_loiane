package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println(testaPalindromo("ADA"));
        System.out.println(testaPalindromo("ADaa"));
    }

    private static boolean testaPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();

        for (Character chr : palavra.toCharArray()) {
            pilha.push(chr);
        }

        StringBuffer palavraInversa = new StringBuffer();
        while (!pilha.isEmpty()) {
            palavraInversa.append(pilha.pop());
        }

        return palavra.contentEquals(palavraInversa);
    }
}
