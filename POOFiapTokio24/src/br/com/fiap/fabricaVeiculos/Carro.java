package br.com.fiap.fabricaVeiculos;
import java.util.Date;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private Date anoFabricacao;
	private Date anoModelo;
	private String renavam;
	private String motor;
	private String tipoCambio;
	private Double aro;
	private Double velocidade;
	private String nomeCondutor;
	private boolean ligado;
	
	
	
	public Carro(String marca, String modelo, String cor, String anoFabricacao, String anoModelo, String renavam,
			String motor, String tipoCambio, Double aro, Double velocidade, String nomeCondutor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = new Date();
		this.anoModelo = new Date(); // tem sql date tbm
		this.renavam = renavam;
		this.motor = motor;
		this.tipoCambio = tipoCambio;
		this.aro = aro;
		this.velocidade = velocidade;
		this.nomeCondutor = nomeCondutor;
		this.ligado = false;
	}


	public void ligar() {
		if(!this.ligado) {
			System.out.println("o carro está ligando");
			setLigado(true);
		} else {
			System.out.println("o carro já está ligado");
		}
	}
	
	
	public void desligar() {
		if(this.ligado && velocidade == 0) {
			System.out.println("o carro está desligando");
			setLigado(false);
		} else {
			System.out.println("o carro não pode ser desligado");
		}
	}
	
	public void acelerar(double valor, int limiteVelocidade) {
		if(ligado) {
			System.out.println("o carro está acelerando!");
			if (getVelocidade() + valor <= limiteVelocidade) {
				setVelocidade(getVelocidade()+valor); 				
			} else {
				setVelocidade((double)limiteVelocidade);
			}
		} else {
			System.out.println("o carro está desligado!");
		}
	}
	
	public void frear(double valor) {
		if(ligado && velocidade >0) {
			System.out.println("o carro está freiando!");
			if (getVelocidade() - valor >= 0) {
				setVelocidade(getVelocidade()-valor); 				
			} else {
				setVelocidade(0.0);
			}
			
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


	public Double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
}
