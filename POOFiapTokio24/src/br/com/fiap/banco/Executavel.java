package br.com.fiap.banco;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.fiap.banco.produtos.CDB;

public class Executavel {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João Silva", "12345678900", "15/04/1985");
        ContaCorrente contaCorrente = new ContaCorrente(1234, 1000.0, cliente1, "01/01/2022");
        ContaPoupanca contaPoupanca = new ContaPoupanca(5678, 2000.0, cliente1, "01/01/2022", 1500.0);

        System.out.println("Conta Corrente - Saldo inicial:");
        System.out.println(contaCorrente.exibirSaldo());
        
        CDB cdb = new CDB();
        
        try {
        	
        	contaCorrente.investimento(cdb, 100000);
        	
        	System.out.println("Conta Corrente - depois de investir:");
        } catch (SaldoInsuficiente e) {
        	System.out.println("erro: " + e);
        }
        
        System.out.println(contaCorrente.exibirSaldo());
        
        
        contaCorrente.depositar(200);

	}

}
