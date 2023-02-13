package Lista1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Infome comprimento");
        double c = scan.nextDouble();
        System.out.println("Informe largura");
        double l = scan.nextDouble();
        double area = c * l;
        double perimetro = (2*c) + (2*l);

        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);

    }
    
}
