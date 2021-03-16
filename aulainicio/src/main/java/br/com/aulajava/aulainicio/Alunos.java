package br.com.aulajava.aulainicio;

import java.time.LocalDate;

public class Alunos {

        private String nome;
        private int matricula;
        private LocalDate dataNascimento;


        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getMatricula() {
                return matricula;
        }

        public void setMatricula(int matricula) {
                this.matricula = matricula;
        }

        public LocalDate getDataNascimento() {
                return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
                this.dataNascimento = dataNascimento;
        }

        @Override
        public String toString() {
                return "Aluno \n" +
                        "\n Nome: " + nome  +
                        "\n Matricula: " + matricula +
                        "\n Data de Nascimento: " + dataNascimento;
        }




}
