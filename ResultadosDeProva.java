import java.util.Scanner;

public class ResultadosDeProva{
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0, menor = 1000, soma = 0, qtd = 0, acima = 0, abaixo = 0;

        while (true) {
            String[] entrada = leitor.nextLine().split(" ");
            
            if (entrada[0].equals("-")) {
                break;
            }

            int nota = Integer.parseInt(entrada[1]);
            soma += nota;
            qtd++;

            if (nota >= 700) {
                acima++;
            } else {
                abaixo++;
            }

            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }
        }
        leitor.close();

        int media = soma / qtd;
        System.out.printf("maior: %d\nmenor: %d\nmedia: %d\nacima: %d\nabaixo: %d\n", maior, menor, media, acima, abaixo);
    }
}
