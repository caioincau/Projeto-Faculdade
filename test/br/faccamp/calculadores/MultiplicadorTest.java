package br.faccamp.calculadores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicadorTest {
	Calculavel calc;

	@Before
	public void setUP() {
		this.calc = new Multiplicador();
	}

	@Test
	public void deveMultiplicarDoisNumeros() {
		assertEquals(20, calc.calcula(2, 10), 0);
	}
}
