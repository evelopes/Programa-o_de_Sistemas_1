package aula6;

public class Pedido {
	int numero;
	Produto item;
	int quantidade;
	double valor;
	
	Pedido(int numero, Produto produto, int quantidade){
		this.numero = numero;
		this.item = produto;
		this.quantidade = quantidade;		
	}


	public void calculaPedido() {
		valor = quantidade * item.preco;
	}
	
	public String toString() {
		String s =  "N�mero do pedido: " + this.numero +
				"\nC�digo do Produto: " + item.cod +
				"\nDescri��o: " + item.descricao + 
				"\nPre�o do Produto :" + item.preco + 
				"\nQuantidade: " + this.quantidade + 
				"\nValor total do pedido: " +  this.valor; 
				return s;
	}
	
}
