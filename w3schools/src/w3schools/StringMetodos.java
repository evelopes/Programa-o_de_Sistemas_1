package w3schools;

public class StringMetodos {
	public static void main(String[] args) {
		String texto = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
		System.out.println("O comprimento da string �: "+ texto.length());
		
		String Texto = "Hello World";
		System.out.println(Texto.toLowerCase());
		System.out.println(Texto.toUpperCase());
		
		System.out.println("Variavel 'Texto' � != da vari�vel 'texto'");
		
		String frase = "Saio de meu poema\r\n" + "como quem lava as m�os.";
		System.out.println(frase);
		System.out.println(frase.indexOf("poema"));
		
		
	}
}
