package br.com.dio.projetopoo.bootcamp.pessoas;

import br.com.dio.projetopoo.bootcamp.Bootcamp;
import br.com.dio.projetopoo.bootcamp.servicos.Conteudo;

import java.util.*;

public class Aluno extends Dev {

    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    @Override
    public void inscreverBootCamp(Bootcamp bootcamp) {
        getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getAlunosInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            getConteudosInscritos().remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }
    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

    public Aluno(){
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(this.getNome(), aluno.getNome()) &&
                Objects.equals(this.getConteudosInscritos(), aluno.getConteudosInscritos()) &&
                Objects.equals(this.conteudosConcluidos, aluno.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() + "\n" +
                "conteudosConcluidos = " + conteudosConcluidos + "\n" +
                "conteudosInscritos = " + "\n" +
                conteudosInscritos;
    }
}
