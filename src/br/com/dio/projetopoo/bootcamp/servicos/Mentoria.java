package br.com.dio.projetopoo.bootcamp.servicos;

import br.com.dio.projetopoo.bootcamp.pessoas.Professor;

import java.time.LocalDate;
public class Mentoria extends Conteudo {

    private LocalDate data;
    private Professor palestrante;

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    public Mentoria(){
    }

    public LocalDate getData() {
        return data;
    }

    public Professor getPalestrante() {
        return palestrante;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setPalestrante(Professor palestrante) {
        this.palestrante = palestrante;
    }

    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() + "\n" +
                "descricao = " + getDescricao() + "\n" +
                "data = " + this.data + "\n" +
                "palestrante = " + this.palestrante;
    }
}
