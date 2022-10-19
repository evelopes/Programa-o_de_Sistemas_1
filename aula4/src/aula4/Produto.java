package aula4;

public class Produto {
	int codigo;
	String descricao;
	double preco;
	
	
	Produto(int codigo){
		this.codigo = codigo;
	}
	
	Produto(int cod,String descricao,double preco){
		codigo = cod;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void atualizaPreco(double porcentagem) {
		preco = preco + preco * porcentagem / 100;
	}
}
