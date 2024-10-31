package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	private double saldoInvestimento;
	
	public ContaCorrente(int numeroConta, Double saldo, Cliente cliente, String dataAbertura, double saldoInvestimento) {
		
		super(numeroConta, saldo, cliente, dataAbertura);
		this.saldoInvestimento = saldoInvestimento;
	}
	
	public void investir(String tipoProduto, double valor) {
		this.saldo -= valor;
		
		switch (tipoProduto.toLowerCase()) {
			case "cdb":
				 valor*=1.01;
			case "lci":
				 valor*=1.009;
			case "lca":
				 valor*=1.008;
		}
		
		this.saldoInvestimento += valor;
		
	}
	
	
	
	@Override
	public String exibirSaldo() {
		return "Conta "+idConta+" \n nomeCliente: " + this.cliente.getNomeCliente() + 
				"\n cpfCliente: " + this.cliente.getCpfCliente() + 
				"\n numeroConta: " + numeroConta
				+ "\n dataNascimento: " + this.cliente.getDataNascimento() 
				+ "\n saldo: " + saldo 
				+ "\n saldoInvestimento: " + saldoInvestimento ;
		
	}

}
