package br.com.fiap.fabricaVeiculos;

import java.text.SimpleDateFormat;

public class Condutor {
	private String nomeCondutor;
	private int idadeCondutor;
	private String cpfCondutor;
	
	public Condutor(String nomeCondutor, int idadeCondutor, String cpfCondutor) {
		this.nomeCondutor = nomeCondutor;
		this.idadeCondutor = idadeCondutor;
		this.cpfCondutor = cpfCondutor;
		
		
	}
	

	public String getNomeCondutor() {
		return nomeCondutor;
	}

	public void setNomeCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}

	public int getIdadeCondutor() {
		return idadeCondutor;
	}

	public void setIdadeCondutor(int idadeCondutor) {
		this.idadeCondutor = idadeCondutor;
	}

	public String getCpfCondutor() {
		return cpfCondutor;
	}

	public void setCpfCondutor(String cpfCondutor) {
		this.cpfCondutor = cpfCondutor;
	}


	@Override
	public String toString() {
		return "nomeCondutor: " + this.nomeCondutor
		+ "\nidadeCondutor: " + this.idadeCondutor
		+ "\ncpfCondutor: " + this.cpfCondutor ;
	}
	
	
	
	
	
	
}
