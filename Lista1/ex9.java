package Lista1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Área total do terreno (m2): ");
        double areaTotal = scan.nextDouble();
        
        System.out.print("Área construída do terreno (m2): ");
        double areaConstruida = scan.nextDouble();
        
        double areaNaoConstruida = areaTotal - areaConstruida;
        
        double valorConstruido = areaConstruida * 5.00;
        double valorNaoConstruido = areaNaoConstruida * 3.80;
        
        double valorTotal = valorConstruido + valorNaoConstruido;
        
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
    }
}

