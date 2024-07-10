package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            Integer num = scanner.nextInt();

            if (num == 0) {
                Integer desempilhado = par.desempilha();
                exibirMsgDesempilhado(desempilhado, "par");

                desempilhado = impar.desempilha();
                exibirMsgDesempilhado(desempilhado, "impar");
            } else if ((num % 2) == 0) {
                System.out.println("Empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Empilhando na pilha impar: " + num);
                impar.empilha(num);
            }
        }

        desempilharTodosElementos(par, "par");
        desempilharTodosElementos(impar, "impar");
    }

    private static void exibirMsgDesempilhado(Integer desempilhado, String tipo) {
        if (desempilhado == null) {
            System.out.println("Pilha " + tipo + " esta vazia!");
        } else {
            System.out.println("Desenpilhando da pilha " + tipo + ": " + desempilhado);
        }
    }

    private static void desempilharTodosElementos(Pilha pilha, String tipo) {
        System.out.println("Desempilhando numeros da pilha " + tipo);

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha " + tipo + ": " + pilha.desempilha());
        }

        System.out.println("Todos os elementos da pilha " + tipo + " foram desenpilhados!");
    }
}
