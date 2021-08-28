package com.example.mba.pessoa;

public class Pessoa {
    private int idade;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private String nome;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual){

    }

    public void informaIdade(){

    }
    public void informaNome(){

    }
    public void ajustaDeDataNascimento(){

    }
}
