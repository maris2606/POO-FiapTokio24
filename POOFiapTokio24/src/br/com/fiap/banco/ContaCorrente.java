package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	private double saldoInvestimento;
	
	public ContaCorrente(int numeroConta, Double saldo, Cliente cliente, String dataAbertura, double saldoInvestimento) {
		
		super(numeroConta, saldo, cliente, dataAbertura);
		this.saldoInvestimento = saldoInvestimento;
	}
}
