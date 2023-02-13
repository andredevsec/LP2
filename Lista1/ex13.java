package Lista1;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numero de pessoas: ");
        int pessoas = scan.nextInt();
        System.out.println("Entre com o numero de dias: ");
        int dias = scan.nextInt();
        if(pessoas <=4){
            int valor1= 160;
            System.out.println(pessoas * valor1 * dias);
        }
        if(pessoas >= 5 && pessoas <= 8) {
            int valor2 = 120;
            System.out.println(pessoas * valor2 * dias);

        }
        if(pessoas > 8) {
            int valor3 = 80;
            System.out.println(pessoas * valor3 * dias);
        }

    }
    
}
