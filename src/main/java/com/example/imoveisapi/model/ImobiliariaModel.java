package com.example.imoveisapi.model;

import javax.persistence.*;

@Entity
@Table(name="imobiliarias")
public class ImobiliariaModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String site;
    private int creci;
    private String endereco;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;

    public ImobiliariaModel(Long id, String nome, String site, int creci, String endereco, int numero, String complemento, String cidade, String estado) {
        this.id = id;
        this.nome = nome;
        this.site = site;
        this.creci = creci;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
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

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}

