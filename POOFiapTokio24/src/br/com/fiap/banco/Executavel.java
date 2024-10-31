package br.com.fiap.banco;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João Silva", "12345678900", "15/04/1985");
        ContaCorrente contaCorrente = new ContaCorrente(1234, 1000.0, cliente1, "01/01/2022");
        ContaPoupanca contaPoupanca = new ContaPoupanca(5678, 2000.0, cliente1, "01/01/2022", 1500.0);

        System.out.println("Conta Corrente - Saldo inicial:");
        System.out.println(contaCorrente.exibirSaldo());
        
        
        contaCorrente.investir("cdb", 1000);
        System.out.println("\nConta Corrente - depois do investimento:");
        System.out.println(contaCorrente.exibirSaldo());

        /*
        contaCorrente.depositar(200);
        contaCorrente.sacar(150);
        contaCorrente.investir("CDB", 100);
        System.out.println("\nConta Corrente - depois das transações:");
        System.out.println(contaCorrente.exibirSaldo());

        System.out.println("\nConta Poupança - Saldo inicial:");
        System.out.println(contaPoupanca.exibirSaldo());

        contaCorrente.transferir(contaPoupanca, 300);
        System.out.println("\nConta Corrente - depois das transferência:");
        System.out.println(contaCorrente.exibirSaldo());
        System.out.println("\nConta Poupança - depois das receber transferência:");
        System.out.println(contaPoupanca.exibirSaldo());
        */

	}

}
