import java.util.Scanner;
import java.lang.Math;

public class Movimento {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int posicao1, velocidade1, posicao2, velocidade2, tempo, posicaoFinal1, posicaoFinal2, distanciaAbsoluta;

        posicao1 = leitor.nextInt();
        velocidade1 = leitor.nextInt();
        posicao2 = leitor.nextInt();
        velocidade2 = leitor.nextInt();
        tempo = leitor.nextInt();

        posicaoFinal1 = posicao1 + (tempo * velocidade1);
        posicaoFinal2 = posicao2 + (tempo * velocidade2);

        distanciaAbsoluta = Math.abs(posicaoFinal1 - posicaoFinal2);

        System.out.println(distanciaAbsoluta);

    }
}
