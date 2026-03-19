package model;

public class Pedido {

    private String numeroPedido;
    private String clientePedido;

    private Produto pedido1;
    private Produto pedido2;
    private Produto pedido3;

    private double precoTotal;

    public Pedido(String numeroPedido, String clientePedido) {
        this.numeroPedido = numeroPedido;
        this.clientePedido = clientePedido;
        this.precoTotal = 0;
    }

    public void adicionarProduto(Produto produto) {

        if (pedido1 == null) {
            pedido1 = produto;
            precoTotal += produto.getPrecoProduto();
            System.out.println("Produto adicionado com sucesso!");
        } else if (pedido2 == null) {
            pedido2 = produto;
            precoTotal += pedido2.getPrecoProduto();
            System.out.println("Produto adicionado com sucesso!");
        } else if (pedido3 == null) {
            pedido3 = produto;
            precoTotal += pedido3.getPrecoProduto();
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("Pedido já está cheio.");
        }

    }

    public void mostrarPedido() {
        System.out.println("Número do pedido: " + numeroPedido);
        System.out.println("Nome do cliente: " + clientePedido);
        if (pedido1 != null) {
            System.out.println("Pedido 1: " + pedido1.getNomeProduto());
        }

        if (pedido2 != null) {
            System.out.println("Pedido 2: " + pedido2.getNomeProduto());
        }

        if (pedido3 != null) {
            System.out.println("Pedido 3: " + pedido3.getNomeProduto());
        }

        System.out.println("Total do pedido: R$ " + precoTotal);

    }
}