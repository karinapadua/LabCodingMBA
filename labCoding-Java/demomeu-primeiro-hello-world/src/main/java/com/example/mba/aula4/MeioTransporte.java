package com.example.mba.aula4;

public abstract class MeioTransporte implements Veículo {


    @Override
    public void acelerar() {
        System.out.println("Acelera!");
    }

    @Override
    public void frear() {
        System.out.println("Freia!");
    }

    public  abstract void buzinar();
}
