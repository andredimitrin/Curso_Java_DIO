// public class SistemaMedia {
//     public static void main(String[] args) {

//         String sigla = "M";

//         if (sigla == "P")
//             System.out.println("Pequeno");
//         else if (sigla == "M")
//             System.out.println("Médio");
//         else if (sigla == "G")
//             System.out.println("Grande");
//         else
//             System.out.println("Inválido");

//     }
// }

public class SistemaMedia {
    public static void main(String[] args) {

        String sigla = "M";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}