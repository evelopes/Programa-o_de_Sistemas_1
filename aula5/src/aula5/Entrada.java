package aula5;

public class Entrada {
	public static void main(String[] args) {
		Produto prod1 = new Produto();
		prod1.codigo = 12345;
		prod1.descricao= "Produto de Teste 1";
		prod1.setPreco(1000);
		prod1.setQuantidade(50);
		System.out.println(prod1.getPreco());
		System.out.println(prod1.getQuantidade());
		System.out.println(prod1.calculaValor());
	}
}
