import java.util.Scanner;

public class SenhasFortes {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] posicoes = new int[4];
        String[] palavras = new String[4];

        for (int i = 0; i < 4; ++i) {
            posicoes[i] = Integer.parseInt(leitor.nextLine());
        }

        for (int i = 0; i < 4; ++i) {
            palavras[i] = leitor.nextLine();
        }

        String senha = "";

        for (int i = 0; i < 4; ++i) {
            senha += palavras[i].charAt(posicoes[i]);
        }

        System.out.println(senha);
    }
}
