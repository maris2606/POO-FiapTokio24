package aula1;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("compras");
		
		System.out.println("total");
		double total = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("cupom");
		String cupom = scan.nextLine();
		
		if ((total > 500) || (cupom.equalsIgnoreCase("DESCONTO10"))) {
			System.out.println("vc recebeu um desconto de 10%: " + total * 0.9);
		}
	
	}

}
