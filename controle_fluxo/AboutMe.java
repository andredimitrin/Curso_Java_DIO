import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        int idade = 0;
        double altura = 0;

        try {
            System.out.println("Digite sua idade");
            idade = scanner.nextInt();

            System.out.println("Digite sua altura em centímetros");
            altura = scanner.nextDouble();

        } catch (InputMismatchException exception) {
            // Código para lidar com a exceção
            System.out.println("Os campos idade e altura precisam ser numéricos");
            scanner.close();
            return; // Encerrar o programa após a exceção
        }

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        scanner.close();
    }
}
