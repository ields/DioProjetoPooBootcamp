package br.com.dio.projetopoo;

import br.com.dio.projetopoo.bootcamp.Bootcamp;
import br.com.dio.projetopoo.bootcamp.pessoas.Aluno;
import br.com.dio.projetopoo.bootcamp.pessoas.Professor;
import br.com.dio.projetopoo.bootcamp.servicos.Curso;
import br.com.dio.projetopoo.bootcamp.servicos.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.setNome("Zé Barbosa");

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso introdutório de Java");
        curso1.setCargaHoraria(16);
        curso1.setProfessor(professor1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("Mentoria de conceitos gerais Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Intro");
        bootcamp1.setDescricao("Bootcamp introdutório Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Epaminondas");
        aluno1.inscreverBootCamp(bootcamp1);

        System.out.println(aluno1);
        System.out.println(" ");
        System.out.println(professor1);
    }
}
