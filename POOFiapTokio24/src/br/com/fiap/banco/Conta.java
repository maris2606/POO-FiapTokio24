package br.com.fiap.banco;

public class Conta {

	static int idStatic = 0;
	private int idConta;
	private Cliente cliente;
	private int numeroConta;
	private Double saldo;
	
	Conta (int numeroConta, Double saldo, Cliente cliente){
		this.idConta = ++idStatic;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;
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
	

	@Override
	public String toString() {
		return "Conta "+idConta+" \n nomeCliente: " + this.cliente.getNomeCliente() + 
				"\n cpfCliente: " + this.cliente.getCpfCliente() + 
				"\n numeroConta: " + numeroConta
				+ "\n saldo: " + saldo;
	}


	
	
	
	
}
