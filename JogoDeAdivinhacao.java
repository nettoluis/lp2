import java.util.Scanner;

public class JogoDeAdivinhacao {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int escolhido = leitor.nextInt();
        leitor.nextLine();

        while (true) {
            int adivinhacao = leitor.nextInt();

            if (adivinhacao > escolhido) {
                System.out.println("MAIOR");
            } else if (adivinhacao < escolhido) {
                System.out.println("MENOR");
            } else {
                System.out.println("ACERTOU");
                return;
            }
        }
    }
}
