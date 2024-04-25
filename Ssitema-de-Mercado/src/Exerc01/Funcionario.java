package Exerc01;

public class Funcionario {
    public String Login;
    public int id;
    public int senha;


    public boolean verificaCadastro(int id, String login, int senha){
        return this.id == id && this.Login.equals(Login) && this.senha == senha;
    }
}
