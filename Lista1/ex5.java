package Lista1;

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o peso");
        double peso = scan.nextDouble();
        System.out.println("Informe a altura");
        double altura = scan.nextDouble();
        System.out.println("Informe o sexo M para Mulher H para Homem ");
        String sexo = scan.next();
        double imc = peso/(altura*altura);
        System.out.println("Seu imc é : " + imc);

        if(sexo.equals("M") && imc <19.1){
            System.out.println("Abaixo do peso");
        }
        else if(sexo.equals("H") && imc <20.7){
            System.out.println("Abaixo do peso");
        }
        else if(sexo.equals("M") && imc == 19.1 || imc <= 25.8){
            System.out.println("Peso ideal");
        }
        else if(sexo.equals("H") && imc ==120.7 || imc <= 26.4){
            System.out.println("Peso ideal");
        }
        else if(sexo.equals("M") && imc > 25.8){
            System.out.println("Acima do peso");
        }
        else if(sexo.equals("H") &&imc > 26.4){
            System.out.println("Peso ideal");
        }
        else{
            System.out.println("Valor invalido");
        }
    }
    
}
