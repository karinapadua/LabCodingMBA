package com.example.mba.aula3;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
//        Pessoa pessoa = new Pessoa();
//        int dia = 0;
//        int mes = 0;
//        int ano = 0;
//        String nome;
//
//        LocalDate localDate = LocalDate.now();
//        Scanner sc = new Scanner (System.in);
//
//        System.out.println("Qual o nome da pessoa?");
//        nome = sc.nextLine();
//        System.out.println("Qual o dia de nascimento da pessoa?");
//        dia = sc.nextInt();
//        System.out.println("Qual o mes de nascimento da pessoa?");
//        mes = sc.nextInt();
//        System.out.println("Qual o ano de nascimento da pessoa?");
//        ano = sc.nextInt();
//
//        pessoa.informaNome(nome);
//        pessoa.ajustaDeDataNascimento(dia, mes, ano);
//        pessoa.calculaIdade(localDate);
//        pessoa.informaIdade();
//
//        System.out.println("\n\n Dados de outras pessoas: \n\n");
//        System.out.println(" Pessoa 1: \n");
//
//        Pessoa pessoa1 = new Pessoa();
//        pessoa1.informaNome("Albert Einstein", "Princeton ", "Nova Jersey - Estados Unidos da América.");
//        pessoa1.datanascimento = "14/03/1879";
//        pessoa1.calculaIdade(localDate);
//        pessoa1.informaIdade();
//
//        System.out.println(" Pessoa 2: \n");
//        Pessoa pessoa2 = new Pessoa();
//        pessoa2.informaNome("Isaac Newton","Cambridge ", "Inglaterra." );
//        pessoa2.datanascimento = "04/01/1643";
//        pessoa2.calculaIdade(localDate);
//        pessoa2.informaIdade();
//
//        System.out.println(" Pessoa 3: \n");
//        Pessoa pessoa3 = new Pessoa();
//        pessoa3.informaNome("Karina Padua", "USP", "São Carlos - SP");
//        pessoa3.datanascimento = "05/04/1984";
//        pessoa3.calculaIdade(localDate);
//        pessoa3.informaIdade();




        /* exercicio 3 - de transações bancárias*/


        ContaCorrente cc = new ContaCorrente();
        String acao;
        String resposta;
        BigDecimal valor = new BigDecimal("0.0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do seu saldo inicial?");
        cc.setSaldo(sc.nextBigDecimal());
        System.out.println(" Meu saldo é de " + cc.getSaldo());
        System.out.println("Deseja fazer uma transacao? Digite S ou N");
        resposta = sc.next();
        while (resposta.equals("S") || resposta.equals("s")) {
                System.out.println("Qual transacao deseja fazer? deposito, venda, saque ou compra");
                acao = sc.next();
                System.out.println("Qual o valor da transacao?");
                valor = sc.nextBigDecimal();
                cc.realizarTransacao(acao, valor);
            System.out.println(" Meu saldo é de " + cc.getSaldo());
            System.out.println("Deseja fazer uma transacao? Digite S ou N");
            resposta = sc.next();
        }
        System.out.println("Obrigada! Volte sempre!");
    }



}
