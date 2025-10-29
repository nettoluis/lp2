import java.util.Scanner;

public class MegaSena {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int entrada = leitor.nextInt();

            for (int i = 0; i < entrada; ++i) {
                for (int j = 0; j < 6; ++j) {
                    int numero1 = (int) ((Math.random() * 100) % 60) + 1, numero2, numero3, numero4, numero5, numero6;

                        do {
                             numero2 = (int) ((Math.random() * 100) % 60) + 1;
                        } while (numero2 == numero1); 
                        
                        do {
                             numero3 = (int) ((Math.random() * 100) % 60) + 1;
                        } while (numero3 == numero2); 
                        
                        do {
                             numero4 = (int) ((Math.random() * 100) % 60) + 1;
                        } while (numero4 == numero3); 

                        do {
                             numero5 = (int) ((Math.random() * 100) % 60) + 1;
                        } while (numero5 == numero4); 
                        
                        do {
                             numero6 = (int) ((Math.random() * 100) % 60) + 1;
                        } while (numero6 == numero5); 

                    System.out.printf("%02d %02d %02d %02d %02d %02d\n", numero1, numero2, numero3, numero4, numero5, numero6);
                }
            }
        }
    }
}
