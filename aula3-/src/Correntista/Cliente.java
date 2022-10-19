package Correntista;

public class Cliente {
	String nome;
	int agencia;
	int conta;
	double saldo;
	
	public void depositar(double valor) {
		saldo +=valor;
	}
	
	public double consultaSaldo() {
		return saldo;
	}
}
