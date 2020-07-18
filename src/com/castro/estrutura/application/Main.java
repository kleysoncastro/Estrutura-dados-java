package com.castro.estrutura.application;

import com.castro.estrutura.vetor.Vetor;

public class Main {

	public static void main(String[] args) {
		
	Vetor vetor = new Vetor(6);
	
	vetor.adiciona("ele 1");
	vetor.adiciona("ele 2");
	vetor.adiciona("ele 3");
	vetor.adiciona("ele 4");
	
	//System.out.println(vetor.toString());
	vetor.adiciona("x", 4);
	//System.out.println(vetor.toString());
	
	}

}
