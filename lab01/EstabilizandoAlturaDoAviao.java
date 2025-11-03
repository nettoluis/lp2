import java.util.Scanner;

public class EstabilizandoAlturaDoAviao {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    static int abs(int a) {
        return (int) Math.pow(Math.pow(a, 2), 0.5);
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int alturaIdeal = leitor.nextInt();
        int alturaInicial = leitor.nextInt();
        int diferenca = abs(alturaIdeal - alturaInicial);

        while (true) {
            int alturaAtual = leitor.nextInt();

            if (alturaAtual == alturaIdeal) {
                System.out.println("OK");
                return;
            }

            if (abs(alturaAtual - alturaIdeal) >= diferenca) {
                System.out.println("PERIGO");
            } else {
                System.out.println("ADEQUADO");
            }

            diferenca = abs(alturaIdeal - alturaAtual);
        }
    }
}
