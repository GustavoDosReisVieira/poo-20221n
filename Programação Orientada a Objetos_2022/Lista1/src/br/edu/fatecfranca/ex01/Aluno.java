package br.edu.fatecfranca.ex01;

import javax.swing.JOptionPane;

public class Aluno {

	int numeroAluno;
	String nome;
	int idade;
	float p1,p2;
	
	public Aluno() {
		
	}
	
	public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
		this.numeroAluno = numeroAluno;
		this.nome = nome;
		this.idade = idade;
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public float notaFinal(){
		return (this.p1 + this.p2 ) / 2;
	}
	
	public String dadosAluno() {
		return "O número do aluno é :" + this.numeroAluno + " Nome: " + nome + " Idade: " + idade;
	}
	
	public String passou() {
		if (this.notaFinal() >= 6) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}	
	}
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null, "Nota Final: " + this.notaFinal()
		+ " Dados Aluno: " + this.dadosAluno()
		+ " Passou de ano? " + this.passou());
	}
	
}
