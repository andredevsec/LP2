import java.util.Scanner;

public class ex12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor da renda: ");
    double renda = sc.nextDouble();
    
    double irpf = 0;
    if (renda <= 10800) {
      System.out.println("Isento de pagamento");
    } else if (renda <= 21600) {
      irpf = (renda * 0.15) - 1620;
    } else {
      irpf = (renda * 0.275) - 4320;
    }
    
    if (irpf > 0) {
      System.out.println("O IRPF Simples a ser pago é de R$" + irpf);
    }
  }
}
