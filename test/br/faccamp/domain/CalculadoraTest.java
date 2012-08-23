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

	@Test
	public void deveAdicionarAMemoria(){
		calculadora.processaUm();
		calculadora.processaDois();
		calculadora.processaMMais();
		assertEquals(12, calculadora.getMemoria(),0);
	}
	@Test
	public void deveRemoverDaMemoria(){
		calculadora.processaUm();
		calculadora.processaDois();
		calculadora.processaMMenos();
		assertEquals(-12, calculadora.getMemoria(),0);
	}
	@Test
	public void deveZerarAMemoria(){
		calculadora.processaUm();
		calculadora.processaDois();
		calculadora.processaMMenos();
		calculadora.processaMC();
		assertEquals(0, calculadora.getMemoria(),0);
	}
	@Test
	public void deveAtualizarODisplayComOValorDeMemoria(){
		calculadora.processaUm();
		calculadora.processaDois();
		calculadora.processaMMenos();
		calculadora.processaMR();
		assertEquals(-12, calculadora.getDisplay().retornaDoubleDaView(),0);
	}
	
	@Test
	public void deveLimparODisplay() throws Exception {
		calculadora.processaUm();
		calculadora.processaDois();
		assertEquals(12, calculadora.getDisplay().retornaDoubleDaView(),0);
		calculadora.processaC();
		assertEquals("", calculadora.getDisplay().getDisplay());
	}
	
	@Test
	public void deveColocarNaPilha() throws Exception {
		calculadora.processaNove();
		calculadora.processaVirgula();
		calculadora.processaZero();
		calculadora.processaRaiz();
		assertEquals(calculadora.getValores().size(), 1);
	}
	
	@Test
	public void deveRetornarOLog() throws Exception {
		calculadora.processaUm();
		calculadora.processaZero();
		calculadora.processaLog();
		assertEquals(1, calculadora.getDisplay().retornaDoubleDaView(),0);
	}
	@Test
	public void deveColocarOValorDaMultiplicacaoNoDisplay() throws Exception {
		calculadora.processaUm();
		calculadora.processaZero();
		calculadora.processaVezes();
		calculadora.processaUm();
		calculadora.processaZero();
		calculadora.processaIgual();
		assertEquals(100, calculadora.getDisplay().retornaDoubleDaView(),0);
	}
	
	@Test
	public void deveColocarOValorDeUmSobreXNoDisplay() throws Exception {
		calculadora.processaUm();
		calculadora.processaZero();
		calculadora.processaUmSobreX();
		assertEquals(0.1, calculadora.getDisplay().retornaDoubleDaView(),0);
	}
	@Test
	public void deveMultiplicar() throws Exception {
		calculadora.processaTres();
		calculadora.processaCinco();
		calculadora.processaVezes();
		calculadora.processaSeis();
		calculadora.processaSete();
		calculadora.processaIgual();
		assertEquals(2345, calculadora.getDisplay().retornaDoubleDaView(),0);
	}
	
	@Test
	public void deveRetornarOPorcentual() throws Exception {
		calculadora.processaQuatro();
		calculadora.processaPorcentual();
		assertEquals(0.04, calculadora.getDisplay().retornaDoubleDaView(),0);
	}
	
	@Test
	public void deveRetornarOFatorialDeOito(){
		calculadora.processaOito();
		calculadora.processaFatorial();
		assertEquals(40320, calculadora.getDisplay().retornaDoubleDaView(),0);
	}
}
