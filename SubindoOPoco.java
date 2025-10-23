import java.util.Scanner;

public class SubindoOPoco {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int distancia = leitor.nextInt();

        int resultado = distancia % 3 == 0 ? distancia / 3 : (distancia / 3) + 1;

        System.out.println(resultado);
    }
}
