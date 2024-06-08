package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula10 {
    public static void main(String[] args) {
        Vetor<Contato> contatos = new Vetor<>(5);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "1234-4567", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "1234-4567", "contato3@gmail.com");

        contatos.adicionar(c1);
        contatos.adicionar(c2);
        contatos.adicionar(c3);

        System.out.println(contatos);
    }
}
