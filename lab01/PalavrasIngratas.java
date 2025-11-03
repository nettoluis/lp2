import java.util.Scanner;

public class PalavrasIngratas {
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


    public static boolean ehIngrata(String palavra) {
        for (int i = 0; i < palavra.length(); ++i) {
            if (ehVogal(palavra.charAt(i))) {
                return false;
            }
        }    

        return true;
    }


    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int contador = 0;
            String[] palavrasIngratas = new String[3];

            while (true) {
                if (contador == 3) {
                    break;
                }
                String palavra = leitor.nextLine();

                if (ehIngrata(palavra.toLowerCase())) {
                    palavrasIngratas[contador] = palavra;
                    contador += 1;
                }
            }

            for (String palavra : palavrasIngratas) {
                System.out.println(palavra);
            }
        }
    }
}
