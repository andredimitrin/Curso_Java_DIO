// public class ExemploForArray {
//     public static void main(String[] args) {
//         String alunos[] = { "Felipe", "Maria", "João", "Pedro" };

//         for (int i = 0; i < alunos.length; i++) {
//             System.out.println("O aluno no indice x = " + i + " é " + alunos[i]);
//         }
//     }
// }

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Felipe", "Maria", "João", "Pedro" };

        for (String aluno : alunos) {
            System.out.println("O aluno no indice x = " + aluno);
        }
    }
}