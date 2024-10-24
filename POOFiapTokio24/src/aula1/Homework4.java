package aula1;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("exibir 0 ao 100 exceto 50 a 75");
		
		
		for (int i = 0; i<=100; i++) {
			if(!(i >=50 && i<=75)) {
				System.out.println(i);
			}
		}
	}

}
