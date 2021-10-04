package com.example.mba.aula4;

public class TransporteBicicleta extends MeioTransporte {

    private double numMarchas;

    @Override
    public void buzinar() {
        System.out.println("TLIM TLIM TLIM");
    }

    @Override
    public void acelerar(){
        System.out.println("Pedala!");
    }
}
