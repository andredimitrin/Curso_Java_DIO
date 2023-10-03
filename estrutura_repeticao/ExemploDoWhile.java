import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Random random = new Random(); // Inicializamos a geração de números aleatórios

        System.out.println("Discando... ");

        boolean telefoneTocando = false; // Variável de controle para verificar se o telefone está tocando
        do {
            telefoneTocando = tocando(random); // Verificamos se o telefone está tocando
            if (telefoneTocando) {
                System.out.println("Telefone Tocando"); // Se o telefone estiver tocando, exibimos uma mensagem
            }
        } while (telefoneTocando);

        System.out.println("Alô!!!"); // Quando o telefone for atendido, exibimos "Alô!!!"
    }

    private static boolean tocando(Random random) {
        boolean atendeu = random.nextInt(3) == 1; // Simula se o telefone foi atendido (1 em 3 chances)
        return !atendeu; // Retornamos verdadeiro se o telefone não foi atendido
    }
}
