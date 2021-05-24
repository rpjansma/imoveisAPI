package com.example.imoveisapi.model;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    @Table(name = "casa")
    public class CasaModel implements Serializable {
        private static final long serialVersionUID = -4133007625415711068L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String endereco;
        private int numero;
        private float tamanho;
        private boolean churrasqueira;

        public CasaModel(Long id, String endereco, int numero, float tamanho, boolean churrasqueira) {
            this.id = id;
            this.endereco = endereco;
            this.numero = numero;
            this.tamanho = tamanho;
            this.churrasqueira = churrasqueira;
        }

        public CasaModel() {
        }

        ;

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

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public float getTamanho() {
            return tamanho;
        }

        public void setTamanho(float tamanho) {
            this.tamanho = tamanho;
        }

        public boolean isChurrasqueira() {
            return churrasqueira;
        }

        public void setChurrasqueira(boolean churrasqueira) {
            this.churrasqueira = churrasqueira;
        }
    }

