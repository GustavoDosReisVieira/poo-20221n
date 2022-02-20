package br.edu.fatecfranca.ex0;

import javax.swing.*;

public class Carro {
	String modelo;
	int ano;
	float velocidade;
	boolean motor;
	
	// métodos
	
	// métodos construtores
	
	Carro(){
		
	}
	Carro(String modelo, int ano, float velocidade, boolean motor) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
		this.motor = motor;
	}
	
	// Void não retorna nada (sem return)
	void ligar(){ // ligando carro
		this.motor = true;
	}
	void desligar(){
		this.motor = false;
		this.velocidade = 0;
	}
	
	void acelerar(float x){ // Acelerando o carro, o X recebe o quanto acelerou
		this.velocidade += x;
	}
	void frear (float x) { // desacelerando o carro
		this.velocidade -= x;
	}
	
	/* void mostrar(){
		System.out.println("Modelo " + this.modelo 
				+ " Ano " + this.ano 
				+ " Velocidade: " + this.velocidade 
				+ " Status motor: " + this.motor); 
	}*/
	
	void mostrar() {
		JOptionPane.showMessageDialog(null, "Modelo " + this.modelo 
				+ " Ano " + this.ano 
				+ " Velocidade: " + this.velocidade 
				+ " Status motor: " + this.motor); 
	}
}
