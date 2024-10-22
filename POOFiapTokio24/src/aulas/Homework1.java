package aulas;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("numeros pares de 100 ao 0");
		
		for (int i = 100; i>=0; i--) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
