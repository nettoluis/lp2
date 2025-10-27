import java.util.Scanner;

public class Vogais {
   /**
    * Laboratório de Programação 2 - Lab 1
    *
    * @author Luis Netto - 20250019231
    */
    public static boolean ehVogal(char letra) {
        String vogais = "aeiou";
        for (int i = 0; i < 5; ++i) {
            if (letra == vogais.charAt(i)) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 0;
        for (int i = 0; i < 5; ++i) {
            String palavra = leitor.nextLine();
            if (ehVogal(palavra.charAt(0))) {
                ++contador;
            }
        }

        System.out.println(contador);
    }
}

