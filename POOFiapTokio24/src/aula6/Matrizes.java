package aula6;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {
		int[][] x = new int[5][7];
		lerMatriz(x);
		imprimirMatrizForEach(x);
		
	}

	
	public static void lerMatriz(int[][] x){
		Random r = new Random();
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j < x[0].length; j++) {
				x[i][j] = r.nextInt(101);
			}
		}
	
	}

	public static void imprimirMatriz(int[][] x){
		for(int i=0; i<x.length; i++) {
			for(int j=0; j < x[0].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void imprimirMatrizForEach(int[][] x){
		for(int[] linha : x) {
			for(int n : linha) {
				System.out.print(n + " ");
			}
			System.out.println("");
		}
	}

	
	
}
