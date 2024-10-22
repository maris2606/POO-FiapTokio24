package aulas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MelhorQueScanner {

	public static void main(String[] args) {

		double v1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor: "));
		double v2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo valor: "));
		
		double res = v1+v2;
		
		// esse null é um parametro pra customizar a caixa de alerta
		// window builder
		JOptionPane.showMessageDialog(null, "soma: " + res);
		
	}

}
