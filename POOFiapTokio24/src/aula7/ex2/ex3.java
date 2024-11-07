package aula7.ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import aula6.exercicio1.Usuario;

public class ex3 {

	public static void main(String[] args) {

//		Collection<Integer> lista = new ArrayList<Integer>(); // melhor com muitos registros
		// 50.000 4 ms
		// 100.000 5 ms     !
		// 1.000.000 22 ms  !
		
		Collection<Integer> lista = new HashSet<Integer>(); // 2° melhor com 10 000 000
		// 50.000 6 ms
		// 100.000 11 ms
		// 1.000.000 72 ms
		
//		Collection<Integer> lista = new LinkedList<Integer>(); // melhor com - registros
		// 50.000 3 ms      !
		// 100.000 6 ms
		// 1.000.000 102 ms
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i<10_000_000; i++) {
			lista.add(i);
		}
		
		long fim = System.currentTimeMillis();
		
		
		long tempo = fim-inicio;
		
		System.out.println("tempo gasto: "+tempo+"ms");
		
	}
}
