package aula7.ex1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Usuario{
	private int idUsuario;
	private String nome, senha;

	public Usuario(int idUsuario, String nome, String senha) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", senha=" + senha + "]";
	}
	
	
	
	
}
