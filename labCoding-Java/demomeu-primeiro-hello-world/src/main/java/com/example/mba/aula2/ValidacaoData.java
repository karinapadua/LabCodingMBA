package com.example.mba.aula2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ValidacaoData {
    public static void validaData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia do seu nascimento: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês do seu nascimento: ");
        int mes = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        int ano = sc.nextInt();

        if(ano <= 2021){
            if(mes >= 1 && mes <=12){
                if(dia >= 1 && mes <=31){
                    System.out.println("A data e válida: " +dia+"/"+mes+"/"+ano);
                }else{
                    System.out.println("Dia inválido");
                }
            }else{
                System.out.println("Mês inválido");
            }
        }else{
            System.out.println("Ano inválido");
        }

    }

    public static void ValidaLocalDate(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a data de seu nascimento no formato dd/MM/yyyy: ");
        String dataNascimento = sc.next();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate dataNascimentoFormatada = LocalDate.parse(dataNascimento, dateTimeFormatter);

            if (dataNascimentoFormatada.isBefore(LocalDate.now())) {
                System.out.println("Data valida: " + dataNascimentoFormatada);
            } else {
                System.out.println("Data inválida");
            }
        }catch(DateTimeParseException e){
            System.out.println("O formato da data não é válido");
        }
    }
}
