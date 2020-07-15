package com.castro.estrutura.vetor.teste;

import com.castro.estrutura.vetor.Vetor;

public class Aula4TesteTamanho {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(4);
	
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		System.out.println(vetor.busca("elemento 4"));
	}

}
