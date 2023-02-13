package Lista1;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.println("entre com o palavra: ");
        String palavra = scan.next();
        for(int i=0; i<palavra.length(); i++){
            for(int n=1; n<=palavra.length(); n++){
                if(palavra.substring(i, n).equals("a") || palavra.substring(i, n).equals("A")){
                    cont++;                
                }
            }
        }
        System.out.println(cont);
    }
}
