package com.example.crudUsuarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Setores {
    private Long id;
    private String nome;
    private Long numero;
    private String local;

    public Setores(){
    }

    public Setores(Long id, String nome, Long numero, String local) {
		this.id = id;
		this.nome = nome;
		this.numero = numero;
        this.local = local;
	}

    @Id
    @GeneratedValue
    public Long getId() {
        return this.id;
    }
    
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setName(String nome) {
        this.nome = nome;
    }
    
    public Long getNumero() {
        return numero;
    }
    
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }



}
