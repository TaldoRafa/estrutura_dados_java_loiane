package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            int num = scanner.nextInt();

            if ((num % 2) == 0) {
                pilha.empilha(num);
                System.out.println("Empilhado o " + num);
            } else {
                Integer desenpilhado = pilha.desempilha();

                if (desenpilhado == null) {
                    System.out.println("Pilha esta vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando " + desenpilhado);
                }
            }
        }

        System.out.println("Todos os numeros foram lidos, desempilhando numeros da pilha");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desenpilhados!");
    }
}
