package br.com.fiap.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta {

	static int idStatic = 0;
	protected int idConta;
	protected Cliente cliente;
	protected int numeroConta;
	protected Double saldo;
	protected Date dataAbertura;
	
	public Conta (int numeroConta, Double saldo, Cliente cliente, String dataAbertura){
		this.idConta = ++idStatic;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			this.dataAbertura = format.parse(dataAbertura);
		}catch (ParseException e){
			System.err.println("formato de data inválida");
			e.printStackTrace();
		}
	}
	
	public boolean sacar(double valor) {
		consultarSaldo();
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} 
		
		System.out.println("você não pode sacar um valor maior que o seu saldo");
		return false;
	}
	
	public void depositar(double valor) {
		consultarSaldo();
		this.saldo +=valor;
	}
	
	public void transferir(Conta c, double valor) {
		consultarSaldo();
		
		if (this.sacar(valor)) {
			c.depositar(valor);
		} else {
			System.out.println("você não pode transferir um valor maior que o seu saldo");
		}
	}
	
	public void consultarSaldo() {
		System.out.println("saldo atual da conta " +idConta+ " : " +this.saldo+"\n");
	}
	

	public abstract String exibirSaldo();


	
	
	
	
}
