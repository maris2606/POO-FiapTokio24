package br.com.fiap.banco;

public class ContaPoupanca extends Conta{
	private double saldoPoupanca;
	
	public ContaPoupanca(int numeroConta, Double saldo, Cliente cliente, String dataAbertura, double saldoPoupanca) {
		
		super(numeroConta, saldo, cliente, dataAbertura);
		
	}
	
	public void poupar (double valor) {
		this.saldo -= valor;
		this.saldoPoupanca += valor;
	}
	
	@Override
	public String exibirSaldo() {
		return "Conta "+idConta+" \n nomeCliente: " + this.cliente.getNomeCliente() + 
				"\n cpfCliente: " + this.cliente.getCpfCliente() + 
				"\n numeroConta: " + numeroConta
				+ "\n dataNascimento: " + this.cliente.getDataNascimento() 
				+ "\n saldo: " + saldo 
				+ "\n saldoPoupanca: " + saldoPoupanca ;
		
	}

}
