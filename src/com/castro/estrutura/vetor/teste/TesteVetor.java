package com.castro.estrutura.vetor.teste;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
		
		@Test
		public void TestAdicionaComPosicaoInicial() {
			Vetor vetor = new Vetor(6);
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			
			assertEquals(true, vetor.adiciona("x", 0), "Adiciona elemento na posicao inicial");
		}
		
		@Test
		public void TestAdicionaComPosicaoQualquer() {
			Vetor vetor = new Vetor(6);
			vetor.adiciona("elemento 1", 0);
			vetor.adiciona("elemento 2", 1);
			vetor.adiciona("elemento 3", 2);
			
			assertEquals(true, vetor.adiciona("x", 1));
		}
		
		@Test
		public void TestAdicionaComPosicaoFinal() {
			Vetor vetor = new Vetor(5);
			vetor.adiciona("elemento 1", 0);
			vetor.adiciona("elemento 2", 1);
			vetor.adiciona("elemento 3", 2);
			
			 Assertions.assertThrows(IllegalArgumentException.class, () -> {
			      vetor.adiciona("x", 5);
			    });
			
			
		}
		

		 @Test
		  void testAumentaCapicidade() {
		 
		  Vetor vetor = new Vetor(3);
		  vetor.adiciona("1");
		  vetor.adiciona("1");
		  vetor.adiciona("1");
		  vetor.adiciona("1");
		  assertEquals(6, vetor.length());

			 
		  }

		

}
