package contasPagas;

public class Conta {
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    private Produto pro;
    private Cliente cli;   

    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto pro, Cliente cli) {
        this.idConta = idConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.pro = pro;
        this.cli = cli;
    }

    public int getIdConta() {
        return idConta;
    }



    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }



    public String getDataVencimento() {
        return dataVencimento;
    }



    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }



    public String getDataPagamento() {
        return dataPagamento;
    }



    public void setDataPagamento(String dataPagamento) {
        dataPagamento = dataPagamento;
    }



    public Produto getPro() {
        return pro;
    }



    public void setPro(Produto pro) {
        this.pro = pro;
    }



    public Cliente getCli() {
        return cli;
    }



    public void setCli(Cliente cli) {
        this.cli = cli;
    }



    public void visualizarConta() {
        System.out.println("CONTAS PAGAS");
        System.out.println("IDENTIFICADOR: " + getIdConta());
        System.out.println("PRODUTO: " + pro.getDescricaoProduto());
        System.out.println("CLIENTE: " + cli.getNomeCliente() + "CPF: " + cli.getCpf());
        System.out.println("VALOR: " + pro.getValorProduto());
        System.out.println("DATA VENCIMENTO: " + getDataVencimento());
        System.out.println("DATA PAGAMENTO: " + getDataPagamento());
        System.out.println("____________________________________________________");
        
    }
}
