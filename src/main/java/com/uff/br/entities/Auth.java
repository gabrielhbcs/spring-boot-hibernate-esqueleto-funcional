package com.uff.br.entities;

import javax.persistence.*;


@Entity
public class Auth {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Id;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
