package br.faccamp.calculadores;

public class Multiplicador implements Calculavel{

	@Override
	public double calcula(double a, double p) {
		return a*p;
	}

	@Override
	public String operacao() {
		// TODO Auto-generated method stub
		return "*";
	}
	

}
