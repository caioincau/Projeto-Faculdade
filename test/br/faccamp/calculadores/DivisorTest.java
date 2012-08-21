package br.faccamp.calculadores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DivisorTest {
	Calculavel calc ;
	@Before
	public void setUP(){
		this.calc = new Divisor();
	}

	@Test
	public void deveDividir() {
		assertEquals(1, calc.calcula(10, 10),0);
	}
	
	@Test(expected=Exception.class)
	public void deveDarException() {
		calc.calcula(10, 0);
	}

}
