package domain;

import domain.Pessoa;

public class TestaPacote {
    public static void main(String[] args){
        Pessoa p = new Pessoa();

        p.nome = "Zé da Silva";

        System.out.println("Nome: " + p.nome);
    }
}
