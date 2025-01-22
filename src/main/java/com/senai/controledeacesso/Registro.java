package com.senai.controledeacesso;

import java.util.Objects;

public class Registro {
    //atributos
    int id;
    String nome;
    String numeroTelefone;
    String email;
    String imagem;

    //construtor
    public Registro (int id , String nome , String numeroTelefone , String email, String imagem){
        this.id = id;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
        this.imagem = imagem;
    }

    @Override
    public String toString() {
      return String.format("| %S | %s | %s | %s | %s |" , id , nome, numeroTelefone , email , imagem);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return id == registro.id && Objects.equals(nome, registro.nome) && Objects.equals(numeroTelefone, registro.numeroTelefone) && Objects.equals(email, registro.email) && Objects.equals(imagem, registro.imagem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, numeroTelefone, email, imagem);
    }
}
