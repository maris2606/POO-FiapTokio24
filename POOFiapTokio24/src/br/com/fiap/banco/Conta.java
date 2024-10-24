package br.com.fiap.banco;

public class Conta {

	static int idStatic = 0;
	private int idConta;
	private String nomeCliente;
	private String cpfCliente;
	private int numeroConta;
	private Double saldo;
	
	Conta (String nomeCliente, String cpfCliente, int numeroConta, Double saldo){
		this.idConta = ++idStatic;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor) {
		consultarSaldo();
		if (valor <= this.saldo) {
			setSaldo( this.saldo - valor);
			return true;
		} 
		
		System.out.println("você não pode sacar um valor maior que o seu saldo");
		return false;
	}
	
	public void depositar(double valor) {
		consultarSaldo();
		setSaldo( this.saldo + valor);
	}
	
	public void transferir(Conta c, double valor) {
		consultarSaldo();
		/*if (valor <=  this.saldo) {
			setSaldo( this.saldo - valor);
			
			c.setSaldo(c.getSaldo() + valor);
		} else {
			System.out.println("você não pode transferir um valor maior que o seu saldo");
		}*/
		
		if (this.sacar(valor)) {
			c.depositar(valor);
		}
	}
	
	public void consultarSaldo() {
		System.out.println("saldo atual da conta " +idConta+ " : " + getSaldo()+"\n");
	}
	

	@Override
	public String toString() {
		return "Conta "+idConta+" \n nomeCliente: " + nomeCliente + "\n cpfCliente: " + cpfCliente + "\n numeroConta: " + numeroConta
				+ "\n saldo: " + saldo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
