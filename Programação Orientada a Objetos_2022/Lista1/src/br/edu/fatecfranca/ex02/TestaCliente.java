package br.edu.fatecfranca.ex02;

public class TestaCliente {

	public static void main(String[] args) {
		System.out.println("Hoje � 20_02_2022 - Exerc�cio de casa");
		
		Cliente obj1 = new Cliente(1016, 0001, "Fulano", 1000);
		obj1.realizarDeposito(1000);
		obj1.realizarSaque(2000);
		obj1.dadosCliente();
		
		Cliente obj2 = new Cliente(1017, 0001, "Gustavo", 1000);
		obj2.realizarDeposito(1000);
		obj2.realizarSaque(3000);
		obj2.dadosCliente();
	}
}
