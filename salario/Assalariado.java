public class Assalariado extends Funcionario {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public double vencimento() {
        return this.salario;
    }
}
