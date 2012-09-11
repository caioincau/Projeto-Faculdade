package br.faccamp.calculadores;

public class Subtracao implements Calculavel {

	@Override
	public double calcula(double a, double p) {
		return a - p;
	}

	@Override
	public String operacao() {
		return "-";
	}

}
