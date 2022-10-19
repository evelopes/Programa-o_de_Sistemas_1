package Aluno;

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1,n2,n3,media;
		System.out.println("Nota1:");
		n1 = input.nextDouble();
		System.out.println("Nota2:");
		n2 = input.nextDouble();
		System.out.println("Nota3:");
		n3 = input.nextDouble();
		media = (n1+n2+n3)/3;
		System.out.println("Media: " +  media);
		if (media < 3)
			System.out.println("Reprovado");
		else
			if(media <7)
				System.out.println("Exame");
			else
				System.out.println("Aprovado!");
	}

}
