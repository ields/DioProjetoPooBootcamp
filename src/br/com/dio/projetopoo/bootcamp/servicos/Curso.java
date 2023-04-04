package br.com.dio.projetopoo.bootcamp.servicos;

import br.com.dio.projetopoo.bootcamp.pessoas.Professor;
import org.w3c.dom.ls.LSOutput;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private Professor professor;

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + "\n" +
                "descricao = " + getDescricao() + "\n" +
                "cargaHoraria = " + cargaHoraria + "\n" +
                "Professor = " + professor.getNome() + "\n";
    }
}
