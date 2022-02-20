package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Testa {

	public static void main(String[] args) {
		System.out.println("Hoje � 18_02_2022");
		
		
		// criar um objeto 
		Carro obj1 = new Carro();
		obj1.modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ");
		obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: ")); // O que o usu�rio digitar, retorna em String e o ano � Int
		obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade atual do carro: "));
		int resposta = JOptionPane.showConfirmDialog(null, "Carro com moto ligado? ");
		obj1.motor = (resposta == JOptionPane.OK_OPTION);
		
		obj1.mostrar();
		obj1.ligar();
		obj1.mostrar();
		
		obj1.acelerar(80);
		obj1.mostrar();
		
		obj1.frear(20);
		obj1.mostrar();
		
		obj1.desligar();
		obj1.mostrar();
		
		Carro obj2 = new Carro("Palio", 2012, 0, false);
	}
}
