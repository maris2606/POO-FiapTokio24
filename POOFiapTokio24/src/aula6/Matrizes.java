package aula6;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {
		int[][] x = new int[5][7];
		lerVetor(x);
		imprimirVetor(x);
		
	}

	
	public static void lerVetor(int[][] x){
		Random r = new Random();
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j < x[0].length; j++) {
				x[i][j] = r.nextInt(101);
			}
		}
	
	}

	public static void imprimirVetor(int[][] x){
		for(int i=0; i<x.length; i++) {
			for(int j=0; j < x[0].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
