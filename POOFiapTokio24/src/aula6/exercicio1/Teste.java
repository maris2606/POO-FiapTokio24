package aula6.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(new Usuario(5, "popi", "pepe"));
		usuarios.add(new Usuario(1, "mellena", "peta"));
		usuarios.add(new Usuario(6, "pepe", "popi"));
		usuarios.add(new Usuario(3, "joões", "marianaeuteamo123"));
		usuarios.add(new Usuario(2, "Jossona", "sainz55"));
		usuarios.add(new Usuario(4, "maris", "popipepe"));
		
		Collections.sort(usuarios);
		
		for (Usuario u : usuarios) {
			System.out.println(u);
		}
		
		List<Usuario> listaAtualizada = Usuario.remover("joões", usuarios);
		for(Usuario user : listaAtualizada) {
			System.out.println(user.getNome());
		}
		
	}

}
