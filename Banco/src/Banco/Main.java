package Banco;
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("André");
        f1.setSalario(100); 
        f1.setDataEntrada("15 de janero de 2023");
        f1.setDepartamento("T.I");
        
        System.out.println("Nome do funcionário: " + f1.getNome());
        System.out.println("O salario é de: " + f1.getSalario());
        System.out.println("Com a bonificação o salario fica: " + f1.bonifica(50));
        System.out.println("Dada de entrada do funcionario: " + f1.getDataEntrada());
        System.out.println("Seu departamento é: " + f1.getDepartamento());
        System.out.println("O funcionario esta ativo? " + f1.demite());

        // EX3
        f1.mostra();
    }
}

