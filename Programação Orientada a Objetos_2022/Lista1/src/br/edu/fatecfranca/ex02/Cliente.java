package br.edu.fatecfranca.ex02;

import javax.swing.JOptionPane;

public class Cliente {

	int numeroConta, numeroAgencia;
	String nome;
	float saldo;
	
	Cliente(){
		
	}
	
	Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void realizarDeposito(float x) {
		this.saldo += x;
	}
	
	public void realizarSaque(float x) {
		if (this.saldo - x >= 0) {
			this.saldo = this.saldo - x;
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void dadosCliente() {
		JOptionPane.showMessageDialog(null, "O número da conta é: " + this.numeroConta
				+ " O nome do cliente é: " + this.nome
				+ " e seu saldo atual é de R$ " + this.saldo);
	}
}
