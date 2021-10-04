package com.example.mba.aula3;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ContaCorrente {

    private BigDecimal saldo = new BigDecimal("0");
    private BigDecimal txDeposito = new BigDecimal("0.1");
    private BigDecimal txVenda = new BigDecimal("0.2");
    private BigDecimal txSaque = new BigDecimal("0.05");
    private BigDecimal txCompra = new BigDecimal("0.15");



    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void realizarTransacao( String acao, BigDecimal valor){
        switch (acao){
            case "deposito":
                this.saldo = this.saldo.add(valor).add(valor.multiply(txDeposito));
                System.out.println("Foi feito um depósito no valor de " + valor);
                break;
            case "venda":
                this.saldo = this.saldo.add(valor).add(valor.multiply(txVenda));
                System.out.println("Foi feita uma venda no valor de " + valor);
                break;
            case "saque":
                this.saldo = this.saldo.subtract(valor).subtract(valor.multiply(txSaque));
                System.out.println("Foi feito um saque no valor de " + valor);
                break;
            case "compra":
                this.saldo = this.saldo.subtract(valor).subtract(valor.multiply(txCompra));
                System.out.println("Foi feito uma compra no valor de " + valor);
                break;
            default:
                System.out.println("Acão estranha!!!");
        }
    }
}
