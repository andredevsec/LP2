package contasPagas;

public class Programa {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("André", "11002167663");
        Cliente cli2 = new Cliente("Pedro", "11122233336");
        Produto pro1 = new Produto("Notebook core i7", 1580.99);
        Produto pro2 = new Produto("TV LED 42", 2542.99);
        Conta c1 = new Conta(1, "05/07/2011", "03/07/2011", pro1, cli1);
        Conta c2 = new Conta(2, "07/07/2011", "30/06/2011", pro2, cli2);

        c1.visualizarConta();
        c2.visualizarConta();
    }
}
