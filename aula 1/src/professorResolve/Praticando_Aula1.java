package professorResolve;
import java.util.Scanner;
public class Praticando_Aula1 {
    public static void main(String[] args) {
        double n1, n2;
        int op;
        Scanner entrada = new Scanner (System.in);
        
        while (true){
            op = entrada.nextInt();
                if (op==5)                                          //sai do while com a op��o 5
                 break;
                if (op<1 || op>6){                                 //n�o executa o trecho linha 18 a 36
                    System.out.println("Op��o do menu inv�lida");  //e volta ao while  
                    continue;
            }
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            switch (op){
                case 1:                
                System.out.println("Soma = " + (n1+n2));
                break;
            case 2:
                System.out.println("Subtra��o = " + (n1-n2));
                break;
            case 3:
                System.out.println("Multiplica��o = " + (n1*n2));
                break;
            case 4:
                if(n2 == 0){
                    System.out.println("N�O FOI POSS�VEL REALIZAR A OPERA��O");
                    break;
                }
                System.out.println("Divis�o = " + (n1/n2));
                break;
            default:
                System.out.println("Op��o inv�lida");
            }
        }
    
}
     }