package br.faccamp.domain;

import br.faccamp.calculadores.Adicao;
import br.faccamp.calculadores.Calculavel;
import br.faccamp.calculadores.Divisor;
import br.faccamp.calculadores.Multiplicador;
import br.faccamp.calculadores.Potencia;
import br.faccamp.calculadores.Subracao;
import br.faccamp.view.CalculadoraGUI;

public class Calculadora  {
	
	private CalculadoraGUI gui;
	private Display display;
	private double valorInicial;
	Calculavel calculavel;
	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
	}

	public void processaMC() {
		// TODO Auto-generated method stub
		
	}

	public void processaMR() {
		// TODO Auto-generated method stub
		
	}

	public void processaMS() {
		// TODO Auto-generated method stub
		
	}

	public void processaMMais() {
		// TODO Auto-generated method stub
		
	}

	public void processaMMenos() {
		// TODO Auto-generated method stub
		
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
	}

	public void processaMaisOuMenos() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(p*-1));
	}

	public void processaFatorial() {
		long fatorial = fatorial((long)display.retornaDoubleDaView());
		display.setDisplay(String.valueOf(fatorial));
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
		calculavel = new Divisor();
		display.setDisplay("");
	}

	public void processaPorcentual() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(p/100));
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
		calculavel = new Multiplicador();
		display.setDisplay("");
	}

	public void processaUmSobreX() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(1/p));
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
		calculavel = new Subracao();
		display.setDisplay("");
		
	}

	public void processaXElevadoY() {
		valorInicial = display.retornaDoubleDaView();
		calculavel = new Potencia();
		display.setDisplay("");
	}

	public void processaMais() {
		valorInicial = display.retornaDoubleDaView();
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
	}

	public void processaLog() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(Math.log10(p)));
		
	}

	public static long fatorial(long number) {
		if (number == 0) {
			return 1;
		}

		return number * fatorial(number - 1);
	}
//	public double display.retornaDoubleDaView(){
//		return Double.parseDouble(display.getDisplay());
//	}
	
}
