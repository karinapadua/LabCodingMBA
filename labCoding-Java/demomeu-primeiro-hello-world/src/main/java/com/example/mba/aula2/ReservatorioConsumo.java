package com.example.mba.aula2;

import java.util.Scanner;

public class ReservatorioConsumo {

    public static void calculaCapacidadeEAutonomia() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Largura do reservatório em centímetros: ");
        double largura = sc.nextInt();

        System.out.println("Altura do reservatório em centímetros: ");
        double altura = sc.nextInt();

        System.out.println("Comprimento do reservatório em centímetros: ");
        double comprimento = sc.nextInt();

        double capacidade = largura * altura * comprimento/1000;
        System.out.println("A capacidade do reservatório é de " + capacidade + " litros.");

        System.out.println("Consumo médio diário do reservatório em litros/dia: ");
        double consumoMedio = sc.nextInt();

        double dias = capacidade / consumoMedio;
        if (dias < 3) {
            System.out.println("Consumo elevado: " + dias);
        } else if (dias >= 3 && dias <= 8) {
            System.out.println("Consumo moderado: " + dias);
        } else {
            System.out.println("Consumo reduzido: " + dias);
        }
    }
}