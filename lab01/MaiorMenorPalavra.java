import java.util.Scanner;

public class MaiorMenorPalavra {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String palavra = leitor.nextLine();
        String maior = palavra, menor = palavra;
        for (int i = 0; i < 4; ++i) {
            String palavra2 = leitor.nextLine();

            if (palavra2.length() > maior.length()) {
                maior = palavra2;
            }
            if (palavra2.length() < menor.length()) {
                menor = palavra2;
            }
        }

        System.out.println(menor);
        System.out.println(maior);
    }
}
