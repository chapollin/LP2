package contasPagas;

public class Produto {
    private String descricaoProduto;
    private double valorProduto;

    // Construtor
    public Produto(String descricaoProduto, double valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    // Métodos getter para descricaoProduto e valorProduto
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }
}
