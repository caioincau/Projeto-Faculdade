package br.faccamp.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.faccamp.view.CalculadoraGUI;

public class DisplayTest {
	Display display;
	CalculadoraGUI gui;
	@Before
	public void setUp(){
		Calculadora calculadora = new Calculadora();
		this.gui = new CalculadoraGUI(calculadora);
		this.display = new Display(gui);
	}
	
	@Test
	public void deveAlterarOTextoDoDisplay() {
		this.display.setDisplay("10");
		assertEquals(this.display.getDisplay(),"10");
	}
	@Test
	public void devePegarOTextoDisplayComoDouble() {
		this.display.setDisplay("10");
		assertEquals(this.display.retornaDoubleDaView(),10,0);
	}

}
