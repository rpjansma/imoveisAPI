package com.example.imoveisapi.model;

import javax.persistence.*;

@Entity
@Table(name="imobiliaria")
public class ImobiliariaModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String endereco;
    private String nome;
    private String site;
    private int creci;

    public ImobiliariaModel(Long id, String endereco, String nome, String site, int creci) {
        this.id = id;
        this.endereco = endereco;
        this.nome = nome;
        this.site = site;
        this.creci = creci;
    }

    public ImobiliariaModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getCreci() {
        return creci;
    }

    public void setCreci(int creci) {
        this.creci = creci;
    }
}
