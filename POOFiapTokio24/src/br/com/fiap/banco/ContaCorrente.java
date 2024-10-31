package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	private double saldoInvestimento;
	
	public ContaCorrente(int numeroConta, Double saldo, Cliente cliente, String dataAbertura) {
		
		super(numeroConta, saldo, cliente, dataAbertura);
	}
	
	public void investimento(Produto produto, double valor) {
		if (this.sacar(valor)) {
			
			this.saldoInvestimento += produto.investir(valor);;
		}
		
	}
	
	
	
	@Override
	public String exibirSaldo() {
		return "Conta "+idConta+" \n nomeCliente: " + this.cliente.getNomeCliente() + 
				"\n cpfCliente: " + this.cliente.getCpfCliente() + 
				"\n numeroConta: " + numeroConta
				+ "\n dataNascimento: " + this.cliente.getDataNascimento() 
				+ "\n saldo total: " + (saldo + saldoInvestimento);
		
	}

}
