import java.util.Scanner;

public class ex11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o número de dias de uso do carro: ");
    int days = scanner.nextInt();
    System.out.print("Informe a quilometragem do carro: ");
    int mileage = scanner.nextInt();
    
    double fixedCost = 45.00 * days;
    int allowedMileage = 60 * days;
    double excessMileageCost = 0;
    if (mileage > allowedMileage) {
      excessMileageCost = (mileage - allowedMileage) * 0.50;
    }
    double totalCost = fixedCost + excessMileageCost;
    System.out.println("O valor a ser pago é: R$" + totalCost);
  }
}
