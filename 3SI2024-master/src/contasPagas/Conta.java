package contasPagas;

public class Conta {
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    private Produto pro;
    private Cliente cli;

    // Construtor
    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto pro, Cliente cli) {
        this.idConta = idConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.pro = pro;
        this.cli = cli;
    }

    // Método para visualizar a conta
    public void visualizarConta() {
        System.out.println("Identificador da Conta: " + idConta);
        System.out.println("Nome do Produto: " + pro.getDescricaoProduto());
        System.out.println("Nome do Cliente: " + cli.getNomeCliente());
        System.out.println("CPF do Cliente: " + cli.getCpf());
        System.out.println("Valor do Produto: " + pro.getValorProduto());
        System.out.println("Data de Vencimento: " + dataVencimento);
        System.out.println("Data de Pagamento: " + dataPagamento);
    }
}
