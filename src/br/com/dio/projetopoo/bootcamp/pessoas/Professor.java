package br.com.dio.projetopoo.bootcamp.pessoas;

import br.com.dio.projetopoo.bootcamp.Bootcamp;

import java.util.Objects;
import java.util.Set;

public class Professor extends Dev {

    @Override
    public void inscreverBootCamp(Bootcamp bootcamp) {
        getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getProfessoresInscritos().add(this);
    }

    public Professor(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(this.getNome(), professor.getNome()) &&
                Objects.equals(this.getConteudosInscritos(), professor.getConteudosInscritos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos());
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() + "\n" +
                "conteudosInscritos = " + conteudosInscritos;
    }
}
