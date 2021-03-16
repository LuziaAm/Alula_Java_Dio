package br.com.aulajava.aulainicio;

import java.time.LocalDate;

import br.com.aulajava.aulainicio.Alunos;

public class Principal{
    
        public static void main(String [] args){


            Alunos luzia = new Alunos();

            luzia.setNome("Luzia de Castro Amorim");
            luzia.setMatricula(51130310);
            luzia.setDataNascimento(LocalDate.of(1982, 2,28));

            System.out.println (luzia + " \n Bem vindo novo Aluno!");

        }
}
