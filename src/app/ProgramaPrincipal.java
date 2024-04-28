package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args){
        Pessoa fulano = new Pessoa("Fulano da Silva",
                "Rua dos programadores, 42",
                 LocalDate.of(1990, 10, 13),
                 new BigDecimal("1000.99"));

        fulano.apresentarse();
    }
}
