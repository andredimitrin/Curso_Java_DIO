import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }

        // Imprime o terceiro nome (posição 2, pois os índices começam em 0)
        System.out.println(nomes[2]);

        // Imprime o sétimo nome (posição 6)
        System.out.println(nomes[6]);

        // Imprime o nono nome (posição 8)
        System.out.println(nomes[8]);
    }
}
