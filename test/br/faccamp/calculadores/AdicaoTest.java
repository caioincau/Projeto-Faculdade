package br.faccamp.calculadores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdicaoTest {
	Calculavel calc ;
	@Before
	public void setUP(){
		this.calc = new Adicao();
	}
	
	@Test
	public void deveAdicionarDoisNumeros() {
		assertEquals(20, calc.calcula(10, 10),0);
	}
	@Test
	public void deveRetornarUmNumeroNegativo() {
		assertEquals(-90, calc.calcula(10, -100),0);
	}

}
