package Lista1;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.println("entre com o palavra: ");
        String palavra = scan.next();
        for(int i=0; i<palavra.length(); i++){
           if(palavra.substring(i, i+1).equals("a") || palavra.substring(i, i+1).equals("A")){
                    cont++;                
                }
            }
            System.out.println(cont);
        }
        
    }
