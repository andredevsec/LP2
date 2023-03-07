package Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Pessoas p1 = new Pessoas();

        System.out.println("Informe o nome: "); 
        p1.nome = scan.next();
        System.out.println("Informe a idade: ");
        p1.idade = scan.nextInt();

        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        System.out.println(p1.nome + " com mais tr^s aniversario ficaria com a idade de: " + p1.idade);



    }
}
