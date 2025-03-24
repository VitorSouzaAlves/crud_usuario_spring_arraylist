package com.senai.crud_usuario_spring_arraylist.entity;

public class Usuario {
    private Integer id;
    private String nome;

    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
