package w3schools;

public class Matematica {
	public static void main(String[] args) {
		System.out.println(Math.max(5, 10));
		System.out.println(Math.min(5, 10));
		int valor = 9;
		System.out.println("raiz quadrada de " + valor + " �: " +  Math.sqrt(9));
		int randomNum = (int)(Math.random() * 101); 
		System.out.println(randomNum + "/n");
		int num = 15;
		int num2 = 21;
		System.out.println(num > num2);
		System.out.println(num == 15);
		
	}
}
