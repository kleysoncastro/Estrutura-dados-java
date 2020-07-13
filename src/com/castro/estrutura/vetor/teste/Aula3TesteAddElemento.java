package com.castro.estrutura.vetor.teste;

import com.castro.estrutura.vetor.Vetor;

public class Aula3TesteAddElemento {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(2);
		
		try {
			vetor.adiciona("item 1");
			vetor.adiciona("item 2");
			vetor.adiciona("item 3");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
