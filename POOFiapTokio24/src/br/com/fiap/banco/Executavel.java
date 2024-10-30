package br.com.fiap.banco;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nomeCliente;
		String cpfCliente;
		int numeroConta;
		Double saldo;

		ArrayList<Conta> contas = new ArrayList<Conta>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome: ");
			nomeCliente = scan.nextLine();

			System.out.println("Digite o cpf: ");
			cpfCliente = scan.nextLine();

			System.out.println("Digite o numero da conta: ");
			numeroConta = scan.nextInt();

			System.out.println("Digite o saldo: ");
			saldo = scan.nextDouble();

			scan.nextLine();

			System.out.println("----------------");

			contas.add(new Conta(numeroConta, saldo, new Cliente(nomeCliente, cpfCliente, new Date())));
		}

		contas.get(0).sacar(20);

		contas.get(0).sacar(130);

		contas.get(0).depositar(500);

		contas.get(0).transferir(contas.get(1), 100);
		contas.get(1).consultarSaldo();

		contas.get(2).consultarSaldo();

		System.out.println(contas.get(0));

		System.out.println(contas.get(1));

		System.out.println(contas.get(2));

	}

}
