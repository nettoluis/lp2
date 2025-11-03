import java.util.Scanner;

public class OndeEstaWally {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            String[] nomes = leitor.nextLine().split(" ");
            String pseudonimo = "?";

            if (nomes[0].equals("wally")) {
                return;
            }

            for (String nome : nomes) {
                if (nome.length() == 5) {
                    pseudonimo = nome;
                }
            }

            System.out.println(pseudonimo);
        }
        
    }
}
