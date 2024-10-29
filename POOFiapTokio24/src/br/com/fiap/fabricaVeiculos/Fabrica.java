package br.com.fiap.fabricaVeiculos;


public class Fabrica {

	public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", "Corolla", "Preto", 
            "2020", "2021", "1234567890", 
            "1.8", "Automático", 16.0, 0.0, "João Silva");

        Carro carro2 = new Carro("Honda", "Civic", "Prata", 
            "2019", "2020", "0987654321", 
            "2.0", "Manual", 17.0, 0.0, "Maria Oliveira");

        Carro carro3 = new Carro("Ford", "Mustang", "Vermelho", 
            "2021", "2022", "1122334455", 
            "5.0", "Automático", 19.0, 0.0, "Carlos Pereira");

        Carro carro4 = new Carro("Chevrolet", "Onix", "Branco", 
            "2022", "2023", "2233445566", 
            "1.0", "Manual", 15.0, 0.0, "Ana Costa");
		
		carro1.acelerar(10.0, 10);
		
		carro1.ligar();
		
		carro1.acelerar(10.0, 9);
		
		carro1.acelerar(20.0, 100);
		
		carro1.frear(10.0);
		
		carro1.exibirDadosCarro();
		
		carro2.desligar();
		
		carro3.exibirDadosCarro();
		
		carro4.ligar();
		
		carro4.frear(30.0);
		
		
		Caminhao caminhao1 = new Caminhao("Volvo", "FH16", "Azul", 
            "1234567890", 
            "16.0", "Automático", 22.5, 0.0, 4, 
            50000.0, 0.0, "Granel", "João Silva", false);

        Caminhao caminhao2 = new Caminhao("Mercedes", "Actros", "Prata", 
           "0987654321", 
            "13.0", "Manual", 20.0, 0.0, 3, 
            40000.0, 0.0, "Carga Geral", "Maria Oliveira", true);

        Caminhao caminhao3 = new Caminhao("Scania", "R450", "Vermelho", 
             "1122334455", 
            "15.0", "Automático", 24.0, 0.0, 5, 
            55000.0, 0.0, "Conteiner", "Carlos Pereira", true);

        Caminhao caminhao4 = new Caminhao("Iveco", "Stralis", "Branco", 
            "2233445566", 
            "12.0", "Manual", 19.0, 0.0, 2, 
            35000.0, 0.0, "Líquido", "Ana Costa", false);

        // Executando métodos nos objetos Caminhao
        caminhao1.ligar();
        caminhao1.acelerar(20.0, 5);
        caminhao1.carregar(20000.0);
        caminhao1.exibirDadosCaminhao();

        caminhao2.desligar();
        caminhao2.carregar(15000.0);
        caminhao2.exibirDadosCaminhao();

        caminhao3.ligar();
        caminhao3.acelerar(25.0, 10);
        caminhao3.carregar(30000.0);
        caminhao3.frear(15.0);
        caminhao3.exibirDadosCaminhao();

        caminhao4.ligar();
        caminhao4.acelerar(30.0, 8);
        caminhao4.frear(10.0);
        caminhao4.exibirDadosCaminhao();
		
	}

}
