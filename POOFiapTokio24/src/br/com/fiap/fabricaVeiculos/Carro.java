package br.com.fiap.fabricaVeiculos;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private String anoFabricacao;
	private String anoModelo;
	private String renavam;
	private String motor;
	private String tipoCambio;
	private String aro;
	private Double velocidade;
	private String nomeCondutor;
	private boolean ligado;
	
	
	
	public Carro(String marca, String modelo, String cor, String anoFabricacao, String anoModelo, String renavam,
			String motor, String tipoCambio, String aro, Double velocidade, String nomeCondutor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.motor = motor;
		this.tipoCambio = tipoCambio;
		this.aro = aro;
		this.velocidade = velocidade;
		this.nomeCondutor = nomeCondutor;
		this.ligado = false;
	}


	public void ligar() {
		if(ligado == false) {
			System.out.println("o carro está ligando");
			setLigado(true);
		} else {
			System.out.println("o carro já está ligado");
		}
	}
	
	
	public void desligar() {
		if(ligado == true && velocidade == 0) {
			System.out.println("o carro está desligando");
			setLigado(false);
		} else {
			System.out.println("o carro não pode ser desligado");
		}
	}
	
	public void acelerar() {
		if(ligado == true) {
			System.out.println("o carro está acelerando!");
		} else {
			System.out.println("o carro está desligado!");
		}
	}
	
	public void frear() {
		if(ligado == true && velocidade != 0) {
			System.out.println("o carro está freiando!");
		} else {
			System.out.println("o carro está parado!");
		}
	}
	
	public void exibirDadosCarro() {
		 String dados = "Carro\nmarca: " + marca + "\nmodelo: " + modelo + "\ncor: " + cor + "\nanoFabricacao: " + anoFabricacao
				+ "\nanoModelo: " + anoModelo + "\nrenavam: " + renavam + "\nmotor: " + motor + "\ntipoCambio: "
				+ tipoCambio + "\naro: " + aro + "\nvelocidade: " + velocidade + "\nnomeCondutor: " + nomeCondutor
				+ "\nligado: " + ligado;
		 
		 System.out.println(dados);
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	
}
