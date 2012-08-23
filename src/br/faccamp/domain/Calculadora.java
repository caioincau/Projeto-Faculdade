package br.faccamp.domain;

import java.util.ArrayList;
import java.util.List;

import br.faccamp.calculadores.Adicao;
import br.faccamp.calculadores.Calculavel;
import br.faccamp.calculadores.Divisor;
import br.faccamp.calculadores.Multiplicador;
import br.faccamp.calculadores.Potencia;
import br.faccamp.calculadores.Subtracao;
import br.faccamp.view.CalculadoraGUI;

public class Calculadora  {
	
	private CalculadoraGUI gui;
	private Display display;
	private double valorInicial;
	Calculavel calculavel;
	public List<Double> valores;
	private double memoria;
	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
		valores = new ArrayList<Double>();
	}

	public void processaMC() {
		memoria = 0;
	}

	public void processaMR() {
		display.setDisplay(String.valueOf(memoria));
	}

	public void processaMS() {
		
	}

	public void processaMMais() {
		memoria+=display.retornaDoubleDaView();
	}

	public void processaMMenos() {
		memoria-=display.retornaDoubleDaView();
	}

	public void processaCE() {
		display.setDisplay("");
	}

	public void processaC() {
		valorInicial = 0;
		calculavel = null;
		display.setDisplay("");
	}

	public void processaRaiz() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(Math.sqrt(p)));
		addNaLista();
	}

	public void processaMaisOuMenos() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(p*-1));
		addNaLista();
	}

	public void processaFatorial() {
		long fatorial = fatorial((long)display.retornaDoubleDaView());
		display.setDisplay(String.valueOf(fatorial));
		addNaLista();
	}

	public void processaSete() {
		display.atualiza("7");
	}

	public void processaOito() {
		display.atualiza("8");
	}

	public void processaNove() {
		display.atualiza("9");
	}

	public void processaDivisao() {
		valorInicial = display.retornaDoubleDaView();
		addNaLista();
		calculavel = new Divisor();
		display.setDisplay("");
	}

	public void processaPorcentual() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(p/100));
		addNaLista();
	}

	public void processaQuatro() {
		display.atualiza("4");
	}

	public void processaCinco() {
		display.atualiza("5");
	}

	public void processaSeis() {
		display.atualiza("6");
	}

	public void processaVezes() {
		valorInicial = display.retornaDoubleDaView();
		addNaLista();
		calculavel = new Multiplicador();
		display.setDisplay("");
	}

	public void processaUmSobreX() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(1/p));
		addNaLista();
	}

	public void processaUm() {
		display.atualiza("1");
	}

	public void processaDois() {
		display.atualiza("2");
	}

	public void processaTres() {
		display.atualiza("3");
	}

	public void processaMenos() {
		valorInicial = display.retornaDoubleDaView();
		addNaLista();
		calculavel = new Subtracao();
		display.setDisplay("");
		
	}

	public void processaXElevadoY() {
		valorInicial = display.retornaDoubleDaView();
		addNaLista();
		calculavel = new Potencia();
		display.setDisplay("");
	}

	public void processaMais() {
		valorInicial = display.retornaDoubleDaView();
		addNaLista();
		calculavel = new Adicao();
		display.setDisplay("");
	}

	public void processaZero() {
		display.atualiza("0");
	}

	public void processaVirgula() {
		display.atualiza(".");
	}

	public void processaIgual() {
		double calcula = calculavel.calcula(valorInicial, display.retornaDoubleDaView());
		display.setDisplay(String.valueOf(calcula));
		addNaLista();
	}

	public void processaLog() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(Math.log10(p)));
		addNaLista();
	}

	public static long fatorial(long number) {
		if (number == 0) {
			return 1;
		}

		return number * fatorial(number - 1);
	}
	
	public void addNaLista(){
		valores.add(display.retornaDoubleDaView());
	}

	public double getMemoria() {
		return memoria;
	}

	public Display getDisplay() {
		return display;
	}

	public List<Double> getValores() {
		return valores;
	}
	
	

}
