package Exerc01;

public class Produto {
    public String Name;
    public Double Quantity;
    public Double Price;

    public void addProduct(int stock){
        this.Quantity += stock;
    }

    public void subProduct(int stock){
        this.Quantity -= stock;
    }
}
