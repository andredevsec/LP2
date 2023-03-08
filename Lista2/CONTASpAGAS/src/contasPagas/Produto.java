package contasPagas;

public class Produto {
    private String descricaoProduto;
    private Double valorProduto;

    public Produto(String descricaoProduto, double valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public Double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

}
