package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Caminhao extends Veiculo{
	private int eixos;
	private Double qtdCargaSuportada;
	private Double qtdCargaAbastecida;
	private String tipoCargaAbastecida;


	

	public Caminhao(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam,
			String motor, String tipoCambio, Double aro, Double velocidade, Condutor condutor, boolean ligado,
			int eixos, Double qtdCargaSuportada, Double qtdCargaAbastecida, String tipoCargaAbastecida) {
		super(marca, modelo, cor, anoFabricacao, anoModelo, renavam, motor, tipoCambio, aro, velocidade, condutor,
				ligado);
		this.eixos = eixos;
		this.qtdCargaSuportada = qtdCargaSuportada;
		this.qtdCargaAbastecida = qtdCargaAbastecida;
		this.tipoCargaAbastecida = tipoCargaAbastecida;
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
	
	public void carregar (Double qtd) {
		if (getQtdCargaSuportada() <= qtd) {
			setQtdCargaAbastecida(qtd);
		} else {
			System.out.println("quantidade acima da carga suportada");
		}
	}
	
	public void descarregar () {
		if (getQtdCargaAbastecida() > 0) {
			setQtdCargaAbastecida(0.0);
		} else {
			System.out.println("já foi descarregado");
		}
	}
	
	public void exibirDadosCaminhao() {
		String dados = 
				"Caminhao\nmarca: " + marca + "\nmodelo: " + modelo + "\ncor: " + cor + "\nanoFabricacao: " + anoFabricacao
				+ "\nanoModelo: " + anoModelo + "\nrenavam: " + renavam + "\nmotor: " + motor + "\ntipoCambio: "
				+ tipoCambio + "\naro: " + aro + "\nvelocidade: " + velocidade + "\neixos: " + eixos
				+ "\nqtdCargaSuportada: " + qtdCargaSuportada + "\nqtdCargaAbastecida: " + qtdCargaAbastecida
				+ "\ntipoCargaAbastecida: " + tipoCargaAbastecida + "\nDados do condutor: \n" + this.condutor
				+ "\nligado: "+ ligado;
		
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


	public Double getQtdCargaSuportada() {
		return qtdCargaSuportada;
	}


	public void setQtdCargaSuportada(Double qtdCargaSuportada) {
		this.qtdCargaSuportada = qtdCargaSuportada;
	}


	public Double getQtdCargaAbastecida() {
		return qtdCargaAbastecida;
	}


	public void setQtdCargaAbastecida(Double qtdCargaAbastecida) {
		this.qtdCargaAbastecida = qtdCargaAbastecida;
	}
	
	
	
	
}
