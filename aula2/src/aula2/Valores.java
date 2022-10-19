package aula2;

import java.util.Scanner;

public class Valores {

	static int somar (int x, int y) {
		int s;
		s= x + y;
		return s;
	}
	
	static double media (int n1, int n2) {
		double m;
		m = (n1+n2)/2;
		return m;

	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();    //exercício teste com numero 5
		int n2 = entrada.nextInt();   //exercício teste com numero 7
		System.out.println("Soma = " +  somar(n1,n2));
		System.out.println("Media = " +  media(n1,n2));
	}
}
