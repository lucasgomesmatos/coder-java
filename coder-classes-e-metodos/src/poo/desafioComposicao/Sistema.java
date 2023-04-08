package poo.desafioComposicao;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Celular", 998.90), 1);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
