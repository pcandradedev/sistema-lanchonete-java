package app;

import model.Cliente;
import model.Pedido;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Criando cliente:");
        Cliente cliente = new Cliente("Paulo Cesar", "11944500452");
        cliente.exibirCliente();

        System.out.println("==============================================");

        Produto produto1 = new Produto("Hambúrguer", 10.00);
        Produto produto2 = new Produto("Pizza", 10.00);
        Produto produto3 = new Produto("Pastel", 10.00);

        Pedido pedido1 = new Pedido("1155", "Paulo");
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);
        pedido1.adicionarProduto(produto3);

        System.out.println("=======================================");

        pedido1.mostrarPedido();



    }
}
