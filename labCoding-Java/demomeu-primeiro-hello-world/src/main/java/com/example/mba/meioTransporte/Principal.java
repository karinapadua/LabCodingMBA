package com.example.mba.meioTransporte;

public class Principal {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.setCor("vermelho");
        carro1.setCilindradas(1.5);
        carro1.setAnoFabricacao(2020);
        carro1.setFabricante("Wolksgem");
        carro1.setModelo("jetta");
        carro1.setRenavan("111111111111");



        Avião aviao1 = new Avião();
        aviao1.setTamanho(30.53);
        aviao1.setEnvergadura(28.35);
        aviao1.setFabricante("Boeing");
        aviao1.setModelo("737-2c3/adv");
        aviao1.setPesoDecolagem(58.740);

        Bicicleta bicicleta1 = new Bicicleta();
        bicicleta1.setFabricante("Calo");
        bicicleta1.setNumMarchas(8);
        bicicleta1.setPeso(20);
        bicicleta1.setTamanho(17);

    }
}
