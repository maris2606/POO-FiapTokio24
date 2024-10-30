package br.com.fiap.banco;

import java.util.Date;

public class Cliente {
	private String nomeCliente;
	private String cpfCliente;
	private Date dataNascimento;
	
	public Cliente(String nomeCliente, String cpfCliente, Date dataNascimento) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.dataNascimento = dataNascimento;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	
	
}
