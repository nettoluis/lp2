import java.util.Scanner;

public class TrocaPalavra {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static String montaFrase(String frase, String palavraChave) {
        return frase.replaceAll(palavraChave, "***");
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String palavraChave = leitor.nextLine();
        String frase = leitor.nextLine();

        String saida = montaFrase(frase, palavraChave);

        System.out.println(saida);
    }
}
