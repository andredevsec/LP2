package Lista1;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        String numStr = Integer.toString(num);
        String numStrInvertido = "";

        for (int i = numStr.length() - 1; i >= 0; i--) {
            numStrInvertido += numStr.substring(i, i + 1);
        }

        if (numStr.equals(numStrInvertido)) {
            System.out.println(num + " é uma capicua.");
        } else {
            System.out.println(num + " não é uma capicua.");
        }
    }
}
