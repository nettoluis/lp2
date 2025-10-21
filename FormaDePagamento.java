import java.util.Scanner;

public class FormaDePagamento {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        double valor = leitor.nextDouble();
        leitor.nextLine();
        String forma = leitor.nextLine();

        if (forma.equals("debito")) {
            System.out.printf("%.1f REAIS NO DEBITO\n", valor);
        } else if (forma.equals("credito")) {
            String vaiDividir = leitor.nextLine();
            if (vaiDividir.equals("n")) {
                System.out.printf("%.1f REAIS NO CREDITO (DIRETO)\n", valor);
            } else if (vaiDividir.equals("s")) {
                int parcelas = leitor.nextInt();

                double valorParcela = valor / parcelas;

                System.out.printf("%d PARCELAS DE %.1f REAIS\n", parcelas, valorParcela);
            }
        }
    }
}
