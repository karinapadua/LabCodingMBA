package com.example.mba.aula2;

import java.util.Scanner;

public class PlacarResultado {
    public static void placar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos gols o time A fez?");
        int golsA = sc.nextInt();
        System.out.println("Quantos gols o time B fez?");
        int golsB = sc.nextInt();
        if(golsA == golsB){
            System.out.println("O resultado foi empate");
        }else if(golsA > golsB){
            System.out.println("O time A venceu!");
        }else{
            System.out.println("O time B venceu!");
        }
    }
}
