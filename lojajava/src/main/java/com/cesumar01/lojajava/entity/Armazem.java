package com.cesumar01.lojajava.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_livro")
public class Armazem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private String nomeLivro;
    private String generoLivro;
    private String autor;

    public Armazem() { }

    public String getNomeLivro() { return nomeLivro; }
    public String getGeneroLivro() { return generoLivro; }
    public String getAutor() { return autor; }

    public void setNomeLivro(String nomeLivro) { this.nomeLivro = nomeLivro; }
    public void setGeneroLivro(String generoLivro) { this.generoLivro = generoLivro; }
    public void setAutor(String autor) { this.autor = autor; }
}
