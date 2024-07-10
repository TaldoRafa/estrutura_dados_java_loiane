package com.loiane.estruturadados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Paciente> filaComprioridade = new PriorityQueue<>();

        filaComprioridade.add(new Paciente("A", 2));
        filaComprioridade.add(new Paciente("B", 1));
        filaComprioridade.add(new Paciente("C", 3));

        System.out.println(filaComprioridade);
    }
}
