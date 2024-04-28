package domain;

import domain.Pessoa;

public class TestaPacote {
    public static void main(String[] args){
        Pessoa p = new Pessoa();

        p.setNome("Zé da Silva");

        System.out.println("Nome: " + p.getNome());
    }
}
