package aula3;

public class Produto {
	int codigo;
	String descricao;
	double preco;
	
	public void atualizaPreco(double porcentagem) {
		preco = preco + preco * porcentagem / 100;
	}
}
