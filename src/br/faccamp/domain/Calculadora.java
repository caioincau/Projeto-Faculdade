package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora  {
	
	private CalculadoraGUI gui;
	private Display display;
	private double valorInicial;
	private char op;
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
		// TODO Auto-generated method stub
		
	}

	public void processaRaiz() {
		double p = retornaDoubleDaView();
		display.setDisplay(String.valueOf(Math.sqrt(p)));
	}

	public void processaMaisOuMenos() {
		double p = retornaDoubleDaView();
		display.setDisplay(String.valueOf(p*-1));
	}

	public void processaFatorial() {
		long fatorial = fatorial((long)retornaDoubleDaView());
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
		// TODO Auto-generated method stub
		
	}

	public void processaPorcentual() {
		double p = retornaDoubleDaView();
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
		// TODO Auto-generated method stub
		
	}

	public void processaUmSobreX() {
		double p = retornaDoubleDaView();
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
		// TODO Auto-generated method stub
		
	}

	public void processaXElevadoY() {
		// TODO Auto-generated method stub
		
	}

	public void processaZero() {
		display.atualiza("0");
	}

	public void processaVirgula() {
		display.atualiza(".");
	}

	public void processaIgual() {
	}

	public void processaLog() {
		double p = retornaDoubleDaView();
		display.setDisplay(String.valueOf(Math.log10(p)));
		
	}

	public static long fatorial(long number) {
		if (number == 0) {
			return 1;
		}

		return number * fatorial(number - 1);
	}
	public double retornaDoubleDaView(){
		return Double.parseDouble(display.getDisplay());
	}
}
