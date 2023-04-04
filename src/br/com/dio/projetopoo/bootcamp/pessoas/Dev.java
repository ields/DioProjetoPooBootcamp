package br.com.dio.projetopoo.bootcamp.pessoas;

import br.com.dio.projetopoo.bootcamp.Bootcamp;
import br.com.dio.projetopoo.bootcamp.servicos.Conteudo;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Dev {
    private String nome;
    public Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    public abstract void inscreverBootCamp(Bootcamp bootcamp);

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }
}
