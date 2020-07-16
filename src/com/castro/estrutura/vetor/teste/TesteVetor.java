package com.castro.estrutura.vetor.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.castro.estrutura.vetor.Vetor;


public class TesteVetor {
		@Test
		public void testBuscaString() {
			Vetor vetor = new Vetor(2);
			vetor.adiciona("elemento 1");
			assertEquals(0, vetor.busca("elemento 1"));
		}
		
		@Test
		public void TestBuscaIndex() {
			Vetor vetor = new Vetor(2);
			vetor.adiciona("elemento 1");
			assertEquals("elemento 1", vetor.busca(0));
		}
		
		@Test
		public void TestTamanho() {
			Vetor vetor = new Vetor(3);
			vetor.adiciona("1");
			vetor.adiciona("2");
			assertEquals(2, vetor.tamanho());
			
		}
		
		@Test
		public void TestAdiciona() {
			Vetor vetor = new Vetor(2);
			assertEquals(true, vetor.adiciona("1"));
		}
}
