package br.faccamp.calculadores;

public class Divisor implements Calculavel {

	@Override
	public double calcula(double a, double p) {
		if (p != 0) {
			return a / p;
		} else {
			throw new RuntimeException();
		}
	}

}
