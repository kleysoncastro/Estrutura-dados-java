package com.castro.estrutura.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanhoReal;

	public Vetor(int capacidade) {

		this.elementos = new String[capacidade];
		this.tamanhoReal = 0;
	}
	
	/*
	 *  another method with boolean return in place of the exception
	 */
	public void adiciona(String elemento) throws Exception {
		
		if(this.tamanhoReal < this.elementos.length) {
			this.elementos[tamanhoReal] = elemento;
			this.tamanhoReal ++;
		} else {
			throw new Exception("Vetor já está cheio, impossível adicionar o elemento!");
		}
		
		
	}
}
