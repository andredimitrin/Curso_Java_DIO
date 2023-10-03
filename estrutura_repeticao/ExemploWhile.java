import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;

        while (mesada > 0.0) {
            double valorDoce = valorAleatorio();

            // Garante que não gastaremos mais do que a mesada
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce);
            mesada -= valorDoce;
        }

        System.out.println("Mesada restante: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada!!");

        // Mesada deve ser 0 após o loop, pois Joãozinho gastou toda a sua mesada
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
