package br.com.fiap.fabricaVeiculos;

public class Fabrica {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Toyota", "Corolla", "Preto", "2020", "2021", "1234567890", 
                "1.8", "Automático", "16", 0.0, "João Silva");

		Carro carro2 = new Carro("Honda", "Civic", "Prata", "2019", "2020", "0987654321", 
                "2.0", "Manual", "17", 10.0, "Maria Oliveira");

		Carro carro3 = new Carro("Ford", "Mustang", "Vermelho", "2021", "2022", "1122334455", 
                "5.0", "Automático", "19", 0.0, "Carlos Pereira");

		Carro carro4 = new Carro("Chevrolet", "Onix", "Branco", "2022", "2023", "2233445566", 
                "1.0", "Manual", "15", 20.0, "Ana Costa");
		
		carro1.acelerar();
		
		carro1.ligar();
		
		carro1.acelerar();
		
		carro2.desligar();
		
		carro3.exibirDadosCarro();
		
		carro4.ligar();
		
		carro4.frear();
		
		
	}

}
