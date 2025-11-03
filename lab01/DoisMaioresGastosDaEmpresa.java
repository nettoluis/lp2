import java.util.Scanner;

public class DoisMaioresGastosDaEmpresa {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    static void swap(int i1, int i2, int[] sequencia) {
        int temp = sequencia[i1];
        sequencia[i1] = sequencia[i2];
        sequencia[i2] = temp;
    }


    static void bubble(int[] sequencia) {
        boolean houveTroca = false;
        while (true) {
            houveTroca = false;
            for (int i = sequencia.length - 1; i > 0; --i) {
                int atual = sequencia[i], anterior = sequencia[i - 1];
                
                if (atual > anterior) {
                    swap(i, i - 1, sequencia);
                    houveTroca = true;
                }
            }

            if (!houveTroca) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] gastosString = leitor.nextLine().split(" ");
        int[] gastos = new int[gastosString.length];

        for (int i = 0; i < gastosString.length; ++i) {
            gastos[i] = Integer.parseInt(gastosString[i]);
        }

        bubble(gastos);

        System.out.println(gastos[0] + gastos[1]);
    }
}
