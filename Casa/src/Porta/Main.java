package Porta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Porta p1 = new Porta();
        Casa c1 = new Casa();

        System.out.println("Informe a DimensaoX: "); 
        p1.dimensaoX = scan.nextFloat();
        System.out.println("Informe a DimensaoY: ");
        p1.dimensaoY = scan.nextFloat();
        System.out.println("Informe a cor que deseja pintar");
        p1.cor = scan.next();
        System.out.println("Pinte a casa: ");
        c1.corCasa = scan.next();


        p1.abre();
        p1.fecha();
        p1.estaAberta();
        p1.pinta();

        c1.porta1.abre();
        c1.porta2.abre();
        c1.porta3.abre();
        

        System.out.println("DimensãoX: " + p1.dimensaoX + " DimensaoY: " + p1.dimensaoY + " Cor: " + p1.cor + " Está aberta ? " + p1.estaAberta());
        System.out.println("Numero de portas abertas: " + c1.qantasPortasEstaoAbertas(c1.cont));


    }
}

