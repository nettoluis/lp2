import java.util.Scanner;

public class MegaSena {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static boolean estaContido(int elemento, int[] sequencia) {
        for (int e : sequencia) {
            if (e == elemento) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int entrada = leitor.nextInt();

            for (int i = 0; i < entrada; ++i) {
                for (int j = 0; j < 6; ++j) {
                    int[] numeros = new int[6];

                    for (int k = 0; k < 6; ++k) {
                        int numero = 0;
                        do {
                            numero = (int) (Math.random() * 100) % 60 + 1;
                        } while (estaContido(numero, numeros));

                        numeros[k] = numero;
                    }
                    System.out.printf("%02d %02d %02d %02d %02d %02d\n", numeros[0], numeros[1], numeros[2], numeros[3], numeros[4], numeros[5]);
                }
            }
        }
    }
}
