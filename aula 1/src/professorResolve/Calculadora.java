package professorResolve;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		double n1,n2;
		int op=0;
		Scanner entrada = new Scanner(System.in);
		while(op != 5){
		System.out.println("Escolha a operação que deseja fazer: /n 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Sair");
		op = entrada.nextInt();	
		if (op ==5)
			break;
		if (op<1 || op > 6) {
			System.out.println("Opção inválida");
			continue;
		}
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite outro numero: ");
		n2 = entrada.nextDouble();
		switch(op) {
			case 1:		
				System.out.println("A soma é " + (n1 + n2)); 
				break;
			case 2:
				System.out.println("A subtração é " + (n1 - n2)); 
				break;
			case 3:
				System.out.println("A multiplicação é " + (n1 * n2)); 
				break;
			case 4:
				System.out.println("A divisão é " + (n1 / n2)); 
				break;
			case 5:
				 break;			
		
		
	}

		}
	}
}