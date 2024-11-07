package aula7.ex1;

import java.util.HashMap;
import java.util.Map;

import aula6.exercicio1.Usuario;

public class Mapas {

	public static void main(String[] args) {
		Map mapa = new HashMap<>();
		
		mapa.put("5",new Usuario(5, "popi", "pepe"));
		mapa.put("1",new Usuario(1, "mellena", "peta"));
		mapa.put("6",new Usuario(6, "pepe", "popi"));
		mapa.put("3",new Usuario(3, "joões", "marianaeuteamo123"));
		mapa.put("2",new Usuario(2, "Jossona", "sainz55"));
		mapa.put("4",new Usuario(4, "maris", "popipepe"));
		
		System.out.println(buscar("2", mapa) + "\n ---------------------");
		
		
		for (Object chave : mapa.keySet()) {
			System.out.println(buscar(chave, mapa));
		}
	}
	
	public static Object buscar(Object chave, Map mapa) {
		return mapa.get(chave);
	}

}
