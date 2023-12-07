public class Comissionado extends Funcionario {
    private double vendas;
    private double comissao;

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double vencimento() {
        return (this.vendas * this.comissao) / 100;
    }

}
