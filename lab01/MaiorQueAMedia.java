import java.util.Scanner;

public class MaiorQueAMedia {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] valores = leitor.nextLine().split(" ");

        int[] numeros = new int[valores.length];
        int soma = 0;

        for (int i = 0; i < numeros.length; ++i) {
            numeros[i] = Integer.parseInt(valores[i]);
            soma += numeros[i];
        }

        double media = soma / valores.length;

        String saida = "";

        for (int numero : numeros) {
            if (numero > media) {
                if (saida.equals("")) {
                    saida += numero;
                } else {
                    saida += " " + numero;
                }
            }
        }

        System.out.println(saida);
        leitor.close();
    }
}
