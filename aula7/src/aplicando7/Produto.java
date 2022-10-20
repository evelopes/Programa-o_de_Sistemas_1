package aplicando7;

public class Produto {
	String nome;
	int quantidade;
	double preco;
	
	Produto(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	void retiraEstoque(int qtd) {
		if(qtd <= this.quantidade) {
			this.quantidade -= qtd;
		}else {
			System.out.println("Estoque Insuficiente");
		}
	}
	
	void entraEstoque(int qtd) {
		this.quantidade += qtd;
	}

	public String toString() {
		String resposta = "\n" + this.nome + "\n" + this.quantidade + "\n" + this.preco;
		return resposta;
	}
}