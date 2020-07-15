package com.castro.estrutura.vetor.teste;

import com.castro.estrutura.vetor.Vetor;

public class Aula4TesteTamanho {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(4);
	
		vetor.adiciona("elemento 1");

		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());
	}

}
