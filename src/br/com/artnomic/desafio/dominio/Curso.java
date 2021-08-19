package br.com.artnomic.desafio.dominio;

public class Curso {
    private String titulo;
    private String descrisao;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrisao() {
        return descrisao;
    }

    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descrisao='" + descrisao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
