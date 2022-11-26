/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Objects;

public class Usuario {

    private int id_usuario;
    private String nome_usuario;
    private String email_usuario;
    private String senha_senha;
    private String statu;

    public Usuario(String nome_usuario, String email_usuario, String senha_senha, String statu) {
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.senha_senha = senha_senha;
        this.statu = statu;
    }

    public Usuario(String nome_usuario, String email_usuario, String senha_senha) {
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.senha_senha = senha_senha;
    }

    public Usuario(String email_usuario, String senha_senha) {
        this.email_usuario = email_usuario;
        this.senha_senha = senha_senha;
    }

    public Usuario() {
    }

  
 
    

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.id_usuario;
        hash = 19 * hash + Objects.hashCode(this.nome_usuario);
        hash = 19 * hash + Objects.hashCode(this.email_usuario);
        hash = 19 * hash + Objects.hashCode(this.senha_senha);
        hash = 19 * hash + Objects.hashCode(this.statu);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id_usuario != other.id_usuario) {
            return false;
        }
        if (!Objects.equals(this.nome_usuario, other.nome_usuario)) {
            return false;
        }
        if (!Objects.equals(this.email_usuario, other.email_usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha_senha, other.senha_senha)) {
            return false;
        }
        if (!Objects.equals(this.statu, other.statu)) {
            return false;
        }
        return true;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getSenha_senha() {
        return senha_senha;
    }

    public void setSenha_senha(String senha_senha) {
        this.senha_senha = senha_senha;
    }
}
