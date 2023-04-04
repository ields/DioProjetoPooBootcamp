package br.com.dio.projetopoo.bootcamp;

import br.com.dio.projetopoo.bootcamp.pessoas.Aluno;
import br.com.dio.projetopoo.bootcamp.pessoas.Professor;
import br.com.dio.projetopoo.bootcamp.servicos.Conteudo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private int duracao; //Quantidade de dias
    private final LocalDate DATA_INICIAL = LocalDate.now();
    private final LocalDate DATA_FINAL = DATA_INICIAL.plusDays(duracao);
    private Set<Aluno> alunosInscritos = new HashSet<>();
    private Set<Professor> professoresInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public LocalDate getDATA_INICIAL() {
        return DATA_INICIAL;
    }

    public LocalDate getDATA_FINAL() {
        return DATA_FINAL;
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public Set<Professor> getProfessoresInscritos() {
        return professoresInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public void setProfessoresInscritos(Set<Professor> professoresInscritos) {
        this.professoresInscritos = professoresInscritos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return duracao == bootcamp.duracao && Objects.equals(nome, bootcamp.nome) &&
                Objects.equals(descricao, bootcamp.descricao) &&
                Objects.equals(DATA_INICIAL, bootcamp.DATA_INICIAL) &&
                Objects.equals(DATA_FINAL, bootcamp.DATA_FINAL) &&
                Objects.equals(alunosInscritos, bootcamp.alunosInscritos) &&
                Objects.equals(professoresInscritos, bootcamp.professoresInscritos) &&
                Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, duracao,
                DATA_INICIAL, DATA_FINAL, alunosInscritos,
                professoresInscritos, conteudos);
    }
}
