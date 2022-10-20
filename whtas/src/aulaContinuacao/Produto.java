package aulaContinuacao;

public class Produto {
	int codigo;
	String descricao;
	double preco;
	int quantidade;
	Fornecedor fornecedor;
	
	Produto(int codigo, String descricao, double preco, int quantidade, int codigoFornecedor, String nome, String telefone){
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
		fornecedor = new Fornecedor(codigoFornecedor, nome, telefone);
	}
}
