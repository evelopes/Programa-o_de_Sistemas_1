package professorResolve;

import java.util.Scanner;
public class MenuOpcoes {
    public static void main(String[] args) {
		int op;
		double n1,n2;
		while(true) {		
			Scanner entrada = new Scanner(System.in);
		op = entrada.nextInt();  // 1=soma 2=subtracao 3=multiplicacao 4=divisao 5=sair
		if(op < 1 || op > 5) {
			System.out.println("OP��O INV�LIDA");
			continue;  // n�o executa os pr�ximos comandos, volta pro While
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
			if(n2 == 0) {                // se dividido por zero � impossivel fazer a divis�o
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