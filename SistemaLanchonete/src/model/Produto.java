package model;

public class Produto {

    private String nomeProduto;
    private double precoProduto;

    public Produto(String nome, double preco){
        this.nomeProduto = nome;
        this.precoProduto = preco;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void exibirInformacoes(){
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: " + precoProduto);
    }


}
