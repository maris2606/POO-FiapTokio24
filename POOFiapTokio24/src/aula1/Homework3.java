package aula1;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("peso de 3 metais");
		
		double peso1 = scan.nextDouble();
		double peso2 = scan.nextDouble();
		double peso3 = scan.nextDouble();
		
		double maior = 0;
		
		if(peso1 > peso2 && peso1> peso3) {
			maior = peso1;
		}
		
		if(peso2 > peso1 && peso2> peso3) {
			maior = peso2;
		}
		
		if(peso3 > peso1 && peso3> peso2) {
			maior = peso3;
		}
		
		System.out.println("o maior é: "+ maior);
	}

}
