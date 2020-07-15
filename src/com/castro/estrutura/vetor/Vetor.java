package com.castro.estrutura.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanhoReal;

	public Vetor(int capacidade) {

		this.elementos = new String[capacidade];
		this.tamanhoReal = 0;
	}

	/*
	 * another method with boolean return in place of the exception
	 */
	public boolean adiciona(String elemento) {

		if (this.tamanhoReal < this.elementos.length) {
			this.elementos[tamanhoReal] = elemento;
			this.tamanhoReal++;
			return true;
		}
		return false;
	}

	public int tamanho() {
		return this.tamanhoReal;
	}

	@Override
	public String toString() {

		if (this.tamanhoReal == 0)
			return null;

		StringBuilder elementosString = new StringBuilder();
		elementosString.append("[");

		for (int i = 0; i < this.tamanhoReal - 1; i++) {

			elementosString.append(elementos[i]);
			elementosString.append(", ");
		}
		if (this.tamanhoReal > 0) {
			elementosString.append(this.elementos[this.tamanhoReal - 1]);
		}
		elementosString.append("]");

		return elementosString.toString();
	}
	
	public String busca(int posicao) {
		
		if(!(posicao >= 0 && posicao < this.tamanhoReal)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		return this.elementos[posicao];
	}

}
