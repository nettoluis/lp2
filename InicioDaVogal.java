import java.util.Scanner;

public class InicioDaVogal {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; ++i) {
            String entrada = leitor.nextLine();

            String saida = entrada.charAt(0) == 'a' ? "s" : "n";

            System.out.println(saida);
        }
    }
}
