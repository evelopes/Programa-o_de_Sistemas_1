package aula4;

public class TesteCaixa {	
	public static void main(String[] args) {
		Produto prod1 = new Produto(42, "caneta", 42.5);
		System.out.println(prod1.codigo);
		System.out.println(prod1.descricao);
		System.out.println(prod1.preco);
		prod1.atualizaPreco(5);
		System.out.println(prod1.preco);
		
		
		Produto prod2 = new Produto(45);
		prod2.descricao = "Calça";
		prod2.preco = 98;
		System.out.println(prod2.codigo + " " + prod2.descricao + " "+ prod2.preco);
		prod2.atualizaPreco(-8);
		System.out.println(prod2.preco);
		
	}
	
}
