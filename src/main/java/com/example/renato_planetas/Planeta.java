package com.example.renato_planetas;

import java.io.Serializable;

public class Planeta implements Serializable {
    private String nome, carac1, carac2, carac3;
    private Integer imagem;

    public Planeta(String nome, String carac1, String carac2, String carac3, Integer imagem) {
        this.nome = nome;
        this.carac1 = carac1;
        this.carac2 = carac2;
        this.carac3 = carac3;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarac1() {
        return carac1;
    }

    public void setCarac1(String carac1) {
        this.carac1 = carac1;
    }

    public String getCarac2() {
        return carac2;
    }

    public void setCarac2(String carac2) {
        this.carac2 = carac2;
    }

    public String getCarac3() {
        return carac3;
    }

    public void setCarac3(String carac3) {
        this.carac3 = carac3;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }
}

