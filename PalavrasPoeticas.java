import java.util.Scanner;

public class PalavrasPoeticas {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String palavra1 = leitor.nextLine();
        String palavra2 = leitor.nextLine();

        char saoPoeticas = (palavra1.charAt(0) == palavra2.charAt(0) && palavra1.charAt(palavra1.length() - 1) == palavra2.charAt(palavra2.length() - 1)) ? 'S' : 'N';

        System.out.println(saoPoeticas);
    }
}
