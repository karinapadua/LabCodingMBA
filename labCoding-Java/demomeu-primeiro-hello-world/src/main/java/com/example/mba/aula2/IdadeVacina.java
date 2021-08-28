package com.example.mba.aula2;

import java.util.Scanner;

public class IdadeVacina {

    public static void validaIdade(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual e a sua idade?");
        int idade = sc.nextInt();

        if(idade >=45 && idade <=55){
            System.out.println("Sua vacina é Astrazaneca");
        }else{
            System.out.println("Sua vacina será Pfizer ou Moderna");
        }
    }
}
