package professorResolve;

import java.util.Scanner;

public class aplicandoConhecimento {
	public static void main(String[] args) {
		int op;
		double n1,n2;
		Scanner entrada = new Scanner(System.in);
		while(true) {		
		System.out.println("Digite a opera��o que deseja: 1 - m�dia, 2 -diferen�a ><, 3 multiplica��o, 4 divisao,5sair");
		op = entrada.nextInt();
		if(op < 1 || op > 5) {
			System.out.println("OP��O INV�LIDA");
			continue;
		}
		if(op ==5) 
			break;
	
		n1 = entrada.nextDouble();
		n2 = entrada.nextDouble();
		switch(op) {
		case 1:
			System.out.println((n1 +n2)/2);
			break;
		case 2:
			if(n1 > n2){
				System.out.println(n1 - n2);
				} else {
					System.out.println(n2 - n1);
				}
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			if(n2 == 0) {
				System.out.println("N�O FOI POSS�VEL REALIZAR A OPERA��O");
			}else {
			System.out.println(n1 / n2);
			};
			break;
		case 5:
			break;

}
}
	}
}
