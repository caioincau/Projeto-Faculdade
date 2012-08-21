package br.faccamp.calculadores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubracaoTest {
	Calculavel calc ;
	@Before
	public void setUP(){
		this.calc = new Subtracao();
	}
	
	@Test
	public void deveRetornarZero() {
		assertEquals(0, calc.calcula(10, 10),0);
	}
	@Test
	public void deveRetornarUmNumeroPositivo() {
		assertEquals(10, calc.calcula(20, 10),0);
	}

}
