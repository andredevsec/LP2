package Lista1;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a palavra");
        String palavra = scan.next();
        int cont = 0;
        int i = 0;
        while(i < palavra.length()) {
                i++;               
        }
        if(palavra.substring(i, i-1).equals("a") || palavra.substring(i, i-1).equals("A")){
            cont++;
        }        
        System.out.println(i);
    }
    
}
