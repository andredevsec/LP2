package Lista1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a nota 1");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a nota 2");
        double nota2 = scan.nextDouble();
        System.out.println("Informe a nota 3");
        double nota3 = scan.nextDouble();
        System.out.println("Informe a nota 4");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media é : " + media);

        if(media <= 3.49){
            System.out.println("Reprovado");
        }
        else if (media == 3.5 && media <= 6.49) {
            System.out.println("Recuperação");
        } 
        else if (media > 6.5){
            System.out.println("Aprovado");
        }
    }
    
}
