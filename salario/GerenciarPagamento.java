public class GerenciarPagamento {
    public void efetuarPagamento(Funcionario f1) {
        double valor = f1.vencimento();
        System.out.println("\nFolha de Pagamento:\n");
        System.out.println("Nome do Funcionário: " + f1.getNome());
        System.out.println("Valor: " + valor);
    }
}
