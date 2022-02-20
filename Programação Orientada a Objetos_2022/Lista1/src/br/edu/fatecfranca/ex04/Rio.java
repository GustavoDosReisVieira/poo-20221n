package br.edu.fatecfranca.ex04;

import javax.swing.JOptionPane;

public class Rio {

	String nome;
	float nivel;
	boolean poluido;
	
	Rio(){
		
	}
	
	Rio(String nome, float nivel, boolean poluido){
		this.nome = nome;
		this.nivel = nivel;
		this.poluido = poluido;
	}
	
	public void chover(float x) {
		this.nivel += x;
	}
	
	public void ensolarar(float x) {
		this.nivel -=x;
	}
	
	public void limpar() {
		this.poluido = false;
	}
	
	public void sujar() {
		this.poluido = true;
	}
	
	public void mostra() {
		JOptionPane.showMessageDialog(null, "Nome do rio: " + this.nome
				+ " O nível do rio é: " + this.nivel
				+ " Está poluído? " + this.poluido);
	}
}

