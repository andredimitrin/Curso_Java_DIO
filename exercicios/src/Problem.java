// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        System.out.print("Digite um número: ");
         A = sc.nextInt();

        System.out.print("Digite um número: ");
         B = sc.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        sc.close();

    }

}