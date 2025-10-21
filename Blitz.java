import java.util.Scanner;

public class Blitz {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int diasLicenciamento = leitor.nextInt();
        int diasCarteira = leitor.nextInt();
        double bafometro = leitor.nextDouble();

        String deveSerApreendido = diasLicenciamento >= 30 | diasCarteira >= 30 | bafometro > 0.05 ? "True" : "False";

        System.out.println(deveSerApreendido);
    }
}
