package Exerc02;

public class Professor {
    public String Nome;
    public Double salario;
    public int AnoT;

    public double aumentodeSalario(double salario, int AnoT){
        double aumento = this.AnoT * 0.10;

        double salarioFinal = this.salario + aumento;

        return salarioFinal;
    }
}
