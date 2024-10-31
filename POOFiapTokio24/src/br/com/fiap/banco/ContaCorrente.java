package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	private double saldoInvestimento;
	
	public ContaCorrente(int numeroConta, Double saldo, Cliente cliente, String dataAbertura) {
		
		super(numeroConta, saldo, cliente, dataAbertura);
	}
	
	public void investir(String tipoProduto, double valor) {
		if (this.sacar(valor)) {
			
			switch (tipoProduto.toLowerCase()) {
				case "cdb":
					valor*=1.01;
					break;
				case "lci":
					valor*=1.009;
					break;
				case "lca":
					valor*=1.008;
					break;
				default:
					System.out.println("tipo de produto inválido");
					break;
			
			}
			
			this.saldoInvestimento += valor;
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
