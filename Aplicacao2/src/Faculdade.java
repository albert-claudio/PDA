import Exerc02.Aluno;

import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("CÓDIGO | FUNÇÃO ");
        System.out.println(" 1 | Cadastrar aluno e notas");
        System.out.println(" 2 | Cadastrar professor");
        System.out.println(" 3 | Cadastrar Curso");
        System.out.println(" 4 | Cadastra Funcionário");
        System.out.println(" 0 | Encerrar");

        System.out.println("\nSelecione uma opção: ");
        int opcao = scan.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Digite as informação do aluno: ");
                System.out.println("Nome: ");
                aluno.Nome = scan.next() + scan.nextLine();

                System.out.println("Data de nascimento: ");
                aluno.ano = scan.nextInt();

                for (int i = 0; i < 3; i++){
                    System.out.println("Digite a %dº nota: ");
                    aluno.notas[i] = scan.nextInt();
                }

                double media = aluno.calcularMedia(aluno.notas);
                double idade = aluno.calcularIdade();
        }
    }
}
