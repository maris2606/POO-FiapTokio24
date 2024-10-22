package aulas;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("login");
		
		
		System.out.println("usuario");
		String usuario = scan.nextLine();
		System.out.println("senha");
		String senha = scan.nextLine();
		
		if((usuario.equalsIgnoreCase("administrador")) && (senha.equalsIgnoreCase("123"))) {
			System.out.println("entrou");
		} else {
			System.out.println("não entrou");
		}
	}

}
