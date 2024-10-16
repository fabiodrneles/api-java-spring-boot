package com.company.nomeprojeto.tarefas.dto;

public class TarefaDTO {
    private Long id;
    private String Titulo;
    private String descricao;


    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
