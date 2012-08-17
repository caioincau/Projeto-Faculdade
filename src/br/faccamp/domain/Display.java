package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Display {
	
	private CalculadoraGUI gui;

	public Display(CalculadoraGUI gui) {
		this.gui = gui;
	}

	public void atualiza(String texto) {
		gui.atualizaDisplay(texto);
	}

	public String getDisplay() {
		return gui.getDisplay().getText();
	}

	public void setDisplay(String display) {
		this.gui.getDisplay().setText(display);
	}
	
	public double retornaDoubleDaView(){
		return Double.parseDouble(getDisplay());
	}

}
