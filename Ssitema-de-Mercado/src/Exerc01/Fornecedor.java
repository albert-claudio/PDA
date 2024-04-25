package Exerc01;

public class Fornecedor {
    public String Nome;
    public int quantidadeProduto;
    public String categoria;

    public void avisoPoucoEstoque(){
        if (quantidadeProduto < 7){
            System.out.println("\nAtenção: poucos produtos no estoque");
        }
    }
}
