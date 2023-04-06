package poo.umPraMuitos;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "João pedro";
        c1.adicionarItem("Caneta", 20, 3.43);
        c1.adicionarItem("Borracha", 10, 1.43);
        c1.adicionarItem(new Item("Cadernos", 3, 20));


        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

        System.out.println(c1.itens.get(0).compra.getValorTotal());
    }
}
