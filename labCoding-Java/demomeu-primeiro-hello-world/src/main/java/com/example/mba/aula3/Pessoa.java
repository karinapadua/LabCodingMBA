package com.example.mba.aula3;

import org.springframework.cglib.core.Local;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private int idade;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private String nome;
    String datanascimento;
    Universidade Uni = new Universidade();



    public void calculaIdade(LocalDate localdate) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(this.datanascimento);
        LocalDate localdate2 = dataFormatada.toInstant().atZone( ZoneId.systemDefault() ).toLocalDate();
        this.idade = Period.between(localdate2, localdate).getYears();

    }

    public void informaIdade(){
        System.out.println(" A idade da " + this.nome + " é " + this.idade + " anos. \n");
    }
    public void informaNome(String nome){
        this.nome = nome;
        System.out.println("O nome da pessoa é " + this.nome);
    }

    public void informaNome(String nome, String nomeUni, String nomeLocalUni){
            this.nome = nome;
            this.Uni.setNomeUniversidade(nomeUni);
            this.Uni.setLocalizacao(nomeLocalUni);
        System.out.println("O nome da pessoa é " + this.nome + "\n"
                            + "E trabalhou/estudou na universidade " + this.Uni.getNomeUniversidade()
                            + "localizada em/na " + this.Uni.getLocalizacao());
    }

    public void ajustaDeDataNascimento( int dia, int mes, int ano) {
        this.diaNasc = dia;
        this.mesNasc = mes;
        this.anoNasc = ano;
        this.datanascimento = diaNasc + "/" + mesNasc + "/" + anoNasc;
    }


}
