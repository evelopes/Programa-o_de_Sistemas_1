package Correntista;

import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Cliente c1 = new Cliente();
		c1.agencia = 123;
		//System.out.println("Agencia:");
		//c1.agencia = entrada.nextInt();
		c1.conta = 23456;
		c1.nome = "XXX";
		c1.saldo = 1000;
		System.out.println("Saldo: " + c1.saldo);
		System.out.println("Valor do depósito:");
		double v = entrada.nextDouble();
		c1.depositar(v);
		System.out.println("Saldo: " + c1.consultaSaldo());
		
	}

}
