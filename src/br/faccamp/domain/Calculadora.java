package br.faccamp.domain;

import br.faccamp.csv.*;

import java.io.IOException;
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
	private CSVWriter csv;
	private int indice;
	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
		valores = new ArrayList<Double>();
		this.csv = new CSVWriter();
		this.indice = -1;
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

	public void processaRaiz() throws IOException {
		double p = display.retornaDoubleDaView();
		csv.writeOnCSV("Raiz de " + p);
		display.setDisplay(String.valueOf(Math.sqrt(p)));
		escreveOResultado();
		addNaLista();
	}

	public void processaMaisOuMenos() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(p*-1));
		addNaLista();
	}

	public void processaFatorial() throws IOException {
		long fatorial = fatorial((long)display.retornaDoubleDaView());
		csv.writeOnCSV(String.valueOf(display.retornaDoubleDaView())+"!");
		display.setDisplay(String.valueOf(fatorial));
		escreveOResultado();

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

	public void processaPorcentual() throws IOException {
//		double p = display.retornaDoubleDaView();
//		csv.writeOnCSV(p+ " / 100");
//		display.setDisplay(String.valueOf(p/100));
		if(calculavel != null){
			double primeiro = new Double(valorInicial);
			double segundo = new Double(display.getDisplay());
			segundo = (primeiro * segundo) / 100;
			display.setDisplay(String.valueOf(segundo));
			escreveOResultado();

			addNaLista();
		}
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

	public void processaUmSobreX() throws IOException {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(1/p));
		csv.writeOnCSV("1 / "+p);
		escreveOResultado();
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
		if (display.getDisplay().indexOf('.')==-1) {
			display.atualiza(".");
		}
	}
	public void processaUndo() {
		try {
			display.setDisplay(String.valueOf(valores.get(indice)));
			indice -= 1;
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	public void processaRedo() {
		try {
			display.setDisplay(String.valueOf(valores.get(indice)));
			indice += 1;

		} catch (Exception e) {
			throw new RuntimeException();
		}
		}


	public void processaIgual() throws IOException {
		double calcula = calculavel.calcula(valorInicial, display.retornaDoubleDaView());
		preparaParaEscrever();
		display.setDisplay(String.valueOf(calcula));
		escreveOResultado();
		addNaLista();
	}

	private void escreveOResultado() throws IOException {
		csv.writeOnCSV(String.valueOf(display.retornaDoubleDaView()));
	}

	private void preparaParaEscrever() throws IOException {
		csv.writeOnCSV(String.valueOf(valores.get(valores.size()-1)));
		csv.writeOnCSV(calculavel.operacao());
		escreveOResultado();
	}

	public void processaLog() {
		double p = display.retornaDoubleDaView();
		display.setDisplay(String.valueOf(Math.log10(p)));
		addNaLista();
	}

	public static long fatorial(long number) {
		if (number == 0 || number ==1) {
			return 1;
		}

		return number * fatorial(number - 1);
	}
	
	public void addNaLista(){
		valores.add(display.retornaDoubleDaView());
		indice+=1;
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
