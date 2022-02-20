package br.edu.fatecfranca.ex04;

public class TestaRio {

	public static void main(String[] args) {
		
		Rio obj1 = new Rio("Rio Paranaíba", 10, true);
		
		obj1.chover(20);
		obj1.ensolarar(5);
		obj1.limpar();
		obj1.mostra();
		
		Rio obj2 = new Rio("Rio Amazonas", 10, false);
		
		obj2.chover(20);
		obj2.ensolarar(5);
		obj2.sujar();
		obj2.mostra();
	}
}
