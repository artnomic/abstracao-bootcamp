package br.com.artnomic.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descrisao;
    private LocalDate data;

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descrisao='" + descrisao + '\'' +
                ", data=" + data +
                '}';
    }
}
