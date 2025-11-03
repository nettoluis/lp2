import java.util.Scanner;

public class AcimaDaMedia {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int n = leitor.nextInt();

            int[] notas = new int[n];
            int soma = 0, quantidade = 0;
            for (int i = 0; i < n; ++i) {
                int nota = leitor.nextInt();
                notas[i] = nota;
                soma += nota;
                ++quantidade;
            }

            double media = soma / quantidade;

            int acima = 0;
            for (int nota : notas) {
                if (nota > media) {
                    ++acima;
                }
            }

            System.out.println(acima);
        }
    }
}
