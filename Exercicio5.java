import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o lado do quadrado");
        int base = entrada.nextInt();

        System.out.println("Informe o lado do quadrado");
        int base2 = entrada.nextInt();

          int conta =  base * base2;
          //ou: System.out.println(base * altura)

        System.out.println(" o resultado eh " +  conta);


    }

}