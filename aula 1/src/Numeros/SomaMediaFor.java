package Numeros;

import java.util.Scanner;

public class SomaMediaFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, soma=0;
		double media;
		System.out.println("Digite 10 n�meros: ");
		for (int i=0; i <10; i++) {
			num = input.nextInt();
			soma +=num;
			}
		media = (double) soma/10;
			System.out.println("Soma dos n�meros digitados: " +  soma);
			System.out.println("Media dos n�meros digitados: " + media);
				
	}
}
