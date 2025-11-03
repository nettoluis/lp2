import java.util.Scanner;

public class LinguaDoPe {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static boolean ehVogal(char letra) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        for (char vogal : vogais) {
            if (letra == vogal) {
                return true;
            }
        }

        return false;
    }

    public static String ehDaLinguaDoPe(String palavra) {
        String resultado = (palavra.charAt(0) == 'p' && ehVogal(palavra.charAt(1))) ? "s" : "n";
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String palavra = leitor.nextLine();
        String resultado = ehDaLinguaDoPe(palavra);

        System.out.println(resultado);
    }
}
