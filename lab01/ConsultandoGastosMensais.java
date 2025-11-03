import java.util.Scanner;

public class ConsultandoGastosMensais {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    static int procuraIndice(String elemento, String[] sequencia) {
        for (int i = 0; i < sequencia.length; ++i) {
            if (sequencia[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] meses = leitor.nextLine().split(" ");
        String[] gastos = leitor.nextLine().split(" ");

        String mesDesejado = leitor.nextLine();

        System.out.println(gastos[procuraIndice(mesDesejado, meses)]);

    }
}
