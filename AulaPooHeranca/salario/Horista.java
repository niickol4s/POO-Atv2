public class Horista extends Funcionario {
    private double precoHora;
    private double horaTrabalhada;

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public void setHoraTrabalhada(double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public double getHoraTrabalhada() {
        return horaTrabalhada;
    }
    
    @Override
    public double vencimento() {
        return this.horaTrabalhada * this.precoHora;
    }
    
}
