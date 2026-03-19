package model;

public class Cliente {

    private String nomeCliente;
    private String telefoneCliente;


    public Cliente(String nome, String telefone) {
        this.nomeCliente = nome;
        this.telefoneCliente = telefone;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public String getTelefoneCliente(){
        return telefoneCliente;
    }

    public void exibirCliente(){
        System.out.println("Nome Cliente: " + this.nomeCliente);
        System.out.println("Telefone: " + this.telefoneCliente);
    }
}
