package aulaContinuacao;

public class TesteProduto {
	public static void main(String[] args) {
		Produto prod1 =  new Produto(100,"Caderno",25.00,300,9547,"Tilibra","11-94752-0000");
		System.out.println("Dados fornecedor do " + prod1.descricao );
		System.out.println("Código: "+ prod1.fornecedor.codigo + 
				"\nnome: "+ prod1.fornecedor.nome + 
				"\nTelefone: " + prod1.fornecedor.telefone);
		
	}
}
