package br.com.alessandra.workshopdevweb_project.domain;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private String autor;
    private String status;

    public Livro(Long id, String titulo, String autor, String status) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }

    public Livro(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
