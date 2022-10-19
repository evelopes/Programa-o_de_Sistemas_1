package atividade;

public class Motocicleta {
    String modelo;
    String marca;
    int nroChassi;
    String nroPlaca;
    String cor;
    int nroCilindradas;
   
    Motocicleta(int nroChassi, String nroPlaca){
    	this.nroChassi = nroChassi;
    	this.nroPlaca = nroPlaca;      	
    }
    
    Motocicleta(String modelo, String marca){
    	this.modelo = modelo;
    	this.marca = marca;
    }
    
    
    
   public Motocicleta() {
	}
   
   public String licenciar() {
//	   placa = this.nroPlaca;
	   int tamanho = this.nroPlaca.length();
	   String valor = this.nroPlaca.substring(tamanho-1);
	   switch(valor) {
	   case "1": return "Abril";
	   case "2": return "Maio";
	   case "3": return "Junho";
	   case "4": return "Julho";
	   case "5": return "Agosto";
	   case "6": return "Agosto";
	   case "7": return "Setembro";
	   case "8": return "Outubro";
	   case "9": return "Novembro";
	   case "0": return "Dezembro";
	   }
	   return valor;
   }

  boolean checaChassi(int chassi) {
	  if(chassi == nroChassi) {
		  return true;
	  }else {
		  return false;
	  }
  } 
   
public void mostraDados(){
       System.out.println("Modelo : " + modelo);
       System.out.println("Marca : " + marca);
       System.out.println("Número do chassi : " + nroChassi);
       System.out.println("Número da placa : " + nroPlaca);
       System.out.println("Cor : " + cor);
       System.out.println("Número de Cilindradas : " + nroCilindradas);
   }
}


