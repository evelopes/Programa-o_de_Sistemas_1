import java.util.Scanner;

public class Motocicleta {
	String modelo;
	String marca;
	int nroChassi;
	String nroPlaca;
	String cor;
	int nroCilindradas;
	
	String licenciar() {
		 int tamanho = nroPlaca.length();
	        String valor = nroPlaca.substring(tamanho - 1);
	        switch (valor) {
	            case "1": return "abril";
	            case "2": return "maio";
	            case "3": return "junho";
	            case "4": return "julho";
	            case "5": return "agosto";
	            case "6": return "agosto";
	            case "7": return "setembro";
	            case "8": return "outubro";
	            case "9": return "novembro";
	            case "0": return "dezembro";
	        }
	         return valor;
	};

	boolean checaChassi(int chassi) {
	    if (chassi == nroChassi){
            return true;
        }
        else{
            return false;
        }
     }
	}


