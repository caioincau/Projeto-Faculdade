package br.faccamp.calculadores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PotenciaTest {
	
	
	Calculavel calc;

	@Before
	public void setUP() {
		this.calc = new Potencia();
	}


	@Test
	public void deveRetornarUmDoubleValido() {
		double valor = calc.calcula(2, 3);
		assertEquals(8, valor,0);
	}

	@Test
	public void deveRetornarUm(){
		assertEquals(1, calc.calcula(10, 0),0);
	}
	
	@Test
	public void deveRetornarZero(){
		assertEquals(0, calc.calcula(0, 1000),0);
	}
}
