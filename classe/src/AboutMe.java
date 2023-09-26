import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class AboutMe {
    public static void main(String[] args) {
        // Define a codificação para UTF-8
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (em cm): ");
        double altura = scanner.nextDouble();

        System.out.println("\nInformações Pessoais:");
        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " cm");

        // Feche o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
