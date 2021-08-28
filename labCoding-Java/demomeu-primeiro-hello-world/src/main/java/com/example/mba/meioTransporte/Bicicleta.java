package com.example.mba.meioTransporte;

public class Bicicleta {
    private String fabricante;
    private String modelo;
    private double tamanho ;
    private double peso;
    private double numMarchas;

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNumMarchas(double numMarchas) {
        this.numMarchas = numMarchas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public double getNumMarchas() {
        return numMarchas;
    }
}
