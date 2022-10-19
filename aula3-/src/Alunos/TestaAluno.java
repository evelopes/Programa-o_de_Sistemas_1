package Alunos;

import java.util.Scanner;

public class TestaAluno {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome do Aluno: ");
		aluno1.nome = entrada.nextLine();
		System.out.println("Nota de Matemática: ");
		aluno1.notaMat = entrada.nextDouble();
		System.out.println("Nota em Física: ");
		aluno1.notaFis = entrada.nextDouble();
		aluno1.calculaMedia();
		System.out.printf("O aluno %s tirou %2.2f em Matemática e %2.2f em Física \n", aluno1.nome, aluno1.notaMat, aluno1.notaFis);
		System.out.println("Aluno " + aluno1.verificaStatus() + " com média "+ aluno1.media);
		
	}

}
