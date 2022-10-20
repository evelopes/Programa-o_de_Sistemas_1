package Banco;

public class Cliente {
	String nome;
	String cpf;
	int agencia;
	Poupanca ctaPoupanca;
	Corrente ctaCorrente;

	Cliente(String nome, String cpf, int agencia){
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
	}

}
