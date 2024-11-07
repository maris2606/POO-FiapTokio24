package aula7.ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import aula6.exercicio1.Usuario;

public class ex3 {

	public static void main(String[] args) {

		Collection<Integer> lista = new ArrayList<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i<50000; i++) {
			lista.add(i);
		}
		
		long fim = System.currentTimeMillis();
		
		
		long tempo = fim-inicio;
		
		System.out.println("tempo gasto: "+tempo+"ms");
		
	}
}
