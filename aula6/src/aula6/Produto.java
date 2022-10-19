package aula6;

public class Produto {
	int cod;
	String descricao;
	double preco;
	
	Produto(int cod, String desc, double preco){
		this.cod = cod;
		this.descricao = desc;
		this.preco = preco;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
