package w3schools;

public class Variaveis {
	public static void main(String[] args) {
		/* como escrever variáveis:
		 * type variableName = value;
		 * 
		 * Values inside String variables, need to be surrounded to double quotes
		 */
		
		String nome = "Evelin";
		System.out.println(nome);
		
		/*
		 * if you don't want others(or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final or "constant", which means unchangeable and read-only)
		 * 
		 */
		
		final int outroNumero = 415;
		System.out.println(outroNumero);
		
		
		int meuNumero = 15;
		System.out.println(meuNumero);
		meuNumero = 25;
		System.out.println(meuNumero);
		
		
	}

}
