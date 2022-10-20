package aplicando7;

public class ProdutoPerecivel extends Produto{
	int validade;

	ProdutoPerecivel(String nome, int qtd, double preco, int validade){
		super(nome,qtd,preco);
		this.validade = validade;
	}
	
	void retiraEstoque(int qtd) {
		if(validade <= 2) {
			this.quantidade = 0;
		}else {
			this.quantidade -= qtd;
		}
	}
		
	void entraEstoque(int qtd) {
		if(this.quantidade == 0) {
			this.quantidade += qtd;
		}
	}
	
	public String toString() {
		String resp = "\n" + this.nome + 
				"\n" + this.quantidade +
				"\n" + this.preco +
				"\n" + validade;
		return resp;
	}	
}