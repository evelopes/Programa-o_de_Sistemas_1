package aula6;

public class Pedido {
    int numero;
    Produto prod1;
    int quantidade;
    double valor;

    Pedido(int numero, Produto prod1, int quantidade) {
        this.numero = numero;
        this.prod1 = prod1;
        this.quantidade = quantidade;
    }

    public double calculaPedido() {
        valor = prod1.preco * quantidade;
        return valor;
    }

    public String toString() {
        return "Numero do pedido: " + numero + "\nCódigo do produto: " + prod1.cod + "\nDescrição: " + prod1.descricao + "\nQuantidade: " + quantidade; 
    }
}