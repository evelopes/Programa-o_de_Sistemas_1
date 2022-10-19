package w3schools;

public class Repeticao {
	public static void main(String[] args) {
		int num = 0;
		while(num < 5) {
			System.out.println(num);
			++num;
		}

		do {
			System.out.println(num);
			num++;
		}while(num < 10);
		
		for(int i = num; i < 20; i++) {
			System.out.println(i);
		}
}
}
