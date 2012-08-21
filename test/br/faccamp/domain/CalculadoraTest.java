package br.faccamp.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calculadora;
	@Before
	public void setUp(){
		this.calculadora= new Calculadora();
	}

	@Test
	public void deveRetornarOFatorialDeZero() {
		assertEquals(1, calculadora.fatorial(0),0);
	}
	
	@Test
	public void deveRetornarOFatorialDeTres() {
		assertEquals(6, calculadora.fatorial(3),0);
	}

}
