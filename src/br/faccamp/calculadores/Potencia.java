package br.faccamp.calculadores;

public class Potencia implements Calculavel {

	@Override
	public double calcula(double a, double p) {
		return Math.pow(a, p);
	}

	@Override
	public String operacao() {
		return "Pow";
	}

}
