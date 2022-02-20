package br.edu.fatecfranca.ex03;

import javax.swing.JOptionPane;

public class Produto {

	int id, qtde;
	String descricao;
	float preco;
	
	Produto(){
		
	}
	
	Produto(int id, int qtde, String descricao, float preco){
		this.id = id;
		this.qtde = qtde;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void comprar (int x) {
		this.qtde += x;
	}
	
	public void vender (int x ) {
		this.qtde += x;
	}
	
	public void subir (float x) {
		this.preco += x;
	}
	
	public void descer (float x) {
		if (this.preco - x >= 0) {
			this.preco -= x;
		}
		else System.out.println("O preço do produto não pode ser menor do que zero");
	}
	
	public void mostra() {
		JOptionPane.showMessageDialog(null, "ID: " + this.id
				+ " QTDE: " + this.qtde
				+ " Descrição: " + this.descricao
				+ " Preço: " + this.preco);
	}
}
