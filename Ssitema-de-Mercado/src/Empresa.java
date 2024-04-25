import Exerc01.Cliente;
import Exerc01.Fornecedor;
import Exerc01.Funcionario;
import Exerc01.Produto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        funcionario.id = 654321;
        funcionario.Login = "funcionario";
        funcionario.senha = 123456;

        System.out.println("Bem Vindo , funcionario(a)");
        System.out.println("Entre na sua conta: ");

        System.out.println("Digite o id: ");
        int id =scan.nextInt();

        System.out.println("Digite seu login: ");
        String login = scan.next() + scan.nextLine();

        System.out.println("Digite a senha: ");
        int senha = scan.nextInt();

        boolean cadastrado = funcionario.verificaCadastro(id, login, senha);
        if(cadastrado){
            boolean continuar = true;

            while(continuar) {
                System.out.println("CÓDIGO | FUNÇÃO ");
                System.out.println(" 1 | Adicionar produto");
                System.out.println(" 2 | Cadastrar fonercedor");
                System.out.println(" 3 | Cadastrar Cliente");
                System.out.println(" 0 | Encerrar");

                System.out.println("Selecione uma funcionalidade: ");
                int codigo = scan.nextInt();

                switch (codigo) {
                    case 1:
                        Produto produto = new Produto();

                        System.out.println("Informe o produto que será cadastrado: ");
                        produto.Name = scan.next();

                        System.out.println("Informe a quantidade: ");
                        produto.Quantity = scan.nextDouble();

                        System.out.println("Informe o preço individual: ");
                        produto.Price = scan.nextDouble();
                        System.out.println("");

                        System.out.println("Confirmação: " + produto.Name + ", Estoque atual: " + produto.Quantity + ", Preço: R$" + produto.Price);


                        System.out.print("\nDeseja inserir mais produtos? (quantidade)");
                        int stock = scan.nextInt();


                        produto.addProduct(stock);

                        System.out.println("Atualização: " + produto.Name + ", Estoque atual: " + produto.Quantity + ", Preço: R$" + produto.Price);

                        System.out.print("\nAtualmente alguma venda foi realizada?(quantidade)");
                        stock = scan.nextInt();
                        System.out.println("");

                        produto.subProduct(stock);

                        System.out.println("Atualização pós venda: " + produto.Name + ", Estoque atual: " + produto.Quantity + ", Preço: R$" + produto.Price);

                        break;
                    case 2:
                        Fornecedor fornecedor = new Fornecedor();

                        System.out.print("Informe o nome do fornecedor: ");
                        fornecedor.Nome = scan.next() + scan.nextLine();

                        System.out.print("Informe a quantidade de produtos fornecidos: ");
                        fornecedor.quantidadeProduto = scan.nextInt();

                        System.out.print("Informe a categoria do fornecedor: ");
                        fornecedor.categoria = scan.next() + scan.nextLine();

                        System.out.println("\nFornecedor cadastrado com sucesso!");
                        System.out.println("Nome: " + fornecedor.Nome);
                        System.out.println("Quantidade de produtos fornecidos: " + fornecedor.quantidadeProduto);
                        System.out.println("Categoria: " + fornecedor.categoria);

                        fornecedor.avisoPoucoEstoque();
                        break;
                    case 3:
                        Cliente cliente = new Cliente();

                        System.out.println("Informe o nome do cliente: ");
                        cliente.nome = scan.next() + scan.nextLine();

                        System.out.println("Informe o endereço do cliente: ");
                        cliente.Endereco = scan.next() + scan.nextLine();

                        System.out.println("\nCliente cadastrado com sucesso!");
                        System.out.println("Nome: " + cliente.nome);
                        System.out.println("Endereço: " + cliente.Endereco);

                        System.out.println("\nDeseja destivar este cliente? (1 para sim, 0 para não): ");
                        int opcao = scan.nextInt();

                        if (opcao == 1) {
                            cliente.desativarCliente();
                            System.out.println("\nCliente desativar com sucesso!");
                        } else {
                            System.out.println("\nCliente contrinua ativo");
                        }
                        break;
                    case 0:
                        System.out.println("Execusão encerrado!");
                    default:
                        break;


                }
            }
        }else{
            System.out.println("Funcionário inválido!");
            }
    }
}
