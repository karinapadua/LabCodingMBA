package com.example.mba.meioTransporte;

public class Avião {
    private String fabricante;
    private String modelo;
    private double comprimento;
    private double envergadura;
    private double pesoDecolagem;

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public void setPesoDecolagem(double pesoDecolagem) {
        this.pesoDecolagem = pesoDecolagem;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public double getPesoDecolagem() {
        return pesoDecolagem;
    }
}
