package br.edu.fatecfranca.ex03;

public class TestaProduto {

	public static void main(String[] args) {
		
		Produto obj1 = new Produto(2, 500, "Chocolate", 1);
		obj1.comprar(100);
		obj1.vender(50);
		obj1.subir(3);
		obj1.descer(1);
		obj1.mostra();
	}
}
