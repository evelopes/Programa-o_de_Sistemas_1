package w3schools;

public class Condicionais {
	public static void main(String[] args) {
		if (30 > 20) {
			System.out.println("É maior");
		}
		
		int x = 20;
		int y = 35;
		if(x > y) {
			System.out.println("X é maior que Y");
		}else {
			System.out.println("X é menor que Y");			
		}
		
		int time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
				
		String result = (time > 18) ? "Bom dia" : "Boa tarde";
		System.out.println(result);

		int day = 4;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		
	}
}
