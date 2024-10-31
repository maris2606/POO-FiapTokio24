package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected String cor;
	protected Date anoFabricacao;
	protected Date anoModelo;
	protected String renavam;
	protected String motor;
	protected String tipoCambio;
	protected Double aro;
	protected Double velocidade;
	protected Condutor condutor;
	protected boolean ligado;
	
	public Veiculo(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam,
			String motor, String tipoCambio, Double aro, Double velocidade, Condutor condutor, boolean ligado) {
		super();
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
		this.condutor = condutor;
		this.ligado = ligado;
	}
	
	
}
