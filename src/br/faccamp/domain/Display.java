package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Display {
	
	private String display;
	private CalculadoraGUI gui;

	public Display(CalculadoraGUI gui) {
		this.display = "";
		this.gui = gui;
	}

	public void atualiza(String texto) {
		gui.atualizaDisplay(texto);
	}

}
