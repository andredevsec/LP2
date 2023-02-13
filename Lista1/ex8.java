package Lista1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Altura da parede (HP): ");
        int HP = sc.nextInt();
        
        System.out.print("Largura da parede (LP): ");
        int LP = sc.nextInt();
        
        System.out.print("Altura do azulejo (HA): ");
        int HA = sc.nextInt();
        
        System.out.print("Largura do azulejo (LA): ");
        int LA = sc.nextInt();
        
        int areaParede = HP * LP;
        int areaAzulejo = HA * LA;
        
        int numAzulejos = areaParede / areaAzulejo;
        
        System.out.println("Quantidade de azulejos necessários: " + numAzulejos);
    }
}

