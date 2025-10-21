import java.util.Scanner;

public class FuncaoMonotona {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int y1 = leitor.nextInt();
        int y2 = leitor.nextInt();
        int y3 = leitor.nextInt();
        int y4 = leitor.nextInt();

        String mensagem = "";

        if (y1 < y2 && y2 < y3 && y3 < y4) {
            mensagem = "POSSIVELMENTE ESTRITAMENTE CRESCENTE";
        } else if (y1 > y2 && y2 > y3 && y3 > y4) {
            mensagem = "POSSIVELMENTE ESTRITAMENTE DECRESCENTE";
        } else {
            mensagem = "FUNCAO NAO ESTRITAMENTE CRES/DECR";
        }

        System.out.println(mensagem);
    }
}
