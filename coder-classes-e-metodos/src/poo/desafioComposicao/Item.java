package poo.desafioComposicao;

public class Item {

   final Produto produto;
    int quantidade = 0;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
