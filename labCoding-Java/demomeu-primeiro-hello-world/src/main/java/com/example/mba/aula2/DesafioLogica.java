package com.example.mba.aula2;

import java.util.Scanner;

public class DesafioLogica {

    public static void verificacaoMaiorOuMenor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para x: ");
        int x = sc.nextInt();
        System.out.println("Digite um número para y: ");
        int y = sc.nextInt();

        if (x < y) {
            System.out.println("X é menor que Y");
        } else if (x > y) {
            System.out.println("X é maior que Y");
        } else {
            System.out.println("X é igual a Y");
        }
    }

    public static void verificacaoParOuImpar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é par ou impar: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("X é par! ");
        } else {
            System.out.println("X é impar! ");
        }
    }

    public static void verificaSeDivisivel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é divisível por 2, 4, 8, 16, 32 ou 64: ");
        int x = sc.nextInt();
        if (x < 64) {
            if (x % 2 == 0) {
                System.out.println("O número " + x + " é divisível por 2.");
            }
            if (x % 4 == 0) {
                System.out.println("O número " + x + " é divisível por 4.");
            }
            if (x % 8 == 0) {
                System.out.println("O número " + x + " é divisível por 8.");
            }
            if (x % 16 == 0) {
                System.out.println("O número " + x + " é divisível por 16.");
            }
            if (x % 32 == 0) {
                System.out.println("O número " + x + " é divisível por 32.");
            }
            if (x % 64 == 0) {
                System.out.println("O número " + x + " é divisível por 64.");
            }
        } else {
            System.out.println("Número não é divisível por nenhum do seguintes números: 2, 4, 8, 16, 32, 64");
        }
    }
}
