package com.example.mba.aula2;

import java.util.Scanner;

public class ContaSalario {

    public static double recebeSalario(double salario){
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual seu salario?");
        salario = sc.nextDouble();
        return salario;
    }
    public static void gastarSalario( double salario){
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual o valor gasto?");
        double gasto = sc.nextDouble();
        if(salario >= gasto){
            System.out.println("Gastos dentro do orçamento");
        }else{
            System.out.println("Orçamento estourado");
        }
    }
}


//    Scanner sc = new Scanner (System.in);
//        System.out.println("Qual e a sua idade?");
//                int idade = sc.nextInt();