package com.example.mba.meioTransporte;

public class Carro {

    private String fabricante;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private double cilindradas;
    private String renavan;

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public String getRenavan() {
        return renavan;
    }
}
