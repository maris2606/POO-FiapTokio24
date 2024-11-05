package br.com.fiap.banco.produtos;

import br.com.fiap.banco.Produto;

public class LCA implements Produto{
	@Override
	public double investir(double valor) {
		return valor*1.008;
	}
}
