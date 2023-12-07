public class Main {
    public static void main(String[] args) {
        GerenciarPagamento gp = new GerenciarPagamento();

        Assalariado joao = new Assalariado();
        joao.setNome("João");
        joao.setSalario(5320);
        gp.efetuarPagamento(joao);

        Comissionado pedro = new Comissionado();
        pedro.setNome("Pedro");
        pedro.setComissao(5);
        pedro.setVendas(4000);
        gp.efetuarPagamento(pedro);

        Horista laura = new Horista();
        laura.setNome("Laura");
        laura.setHoraTrabalhada(44);
        laura.setPrecoHora(120);
        gp.efetuarPagamento(laura);

    }
}
