package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Ex06 {
    private final static String ABRE = "([{";
    private final static String FECHA = ")]}";

    public static void main(String[] args) {
        System.out.println(verificaSimbolosBalanceados("A + B + C"));
        System.out.println(verificaSimbolosBalanceados(")"));
        System.out.println(verificaSimbolosBalanceados("()"));
        System.out.println(verificaSimbolosBalanceados("{"));
        System.out.println(verificaSimbolosBalanceados("}"));
        System.out.println(verificaSimbolosBalanceados("([{}])"));
    }

    private static boolean verificaSimbolosBalanceados(String expressao) {
        Stack<Character> pilha = new Stack<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.isEmpty()) {
                    return false;
                } else {
                    topo = pilha.pop();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) return false;
                }
            }
            index++;
        }
        return pilha.isEmpty();
    }
}
