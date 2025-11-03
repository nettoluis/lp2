import java.util.Scanner;

public class CalculadoraComOpcao {
   /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author Luis Netto - 20250019231
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String operacao = leitor.nextLine();
        if (!(operacao.equals("+")) && !(operacao.equals("-")) && !(operacao.equals("*")) && !(operacao.equals("/"))) {
            System.out.println("ENTRADA INVALIDA");
            return;
        }

        double operando1 = leitor.nextDouble();
        leitor.nextLine();
        double operando2 = leitor.nextDouble();

        double resultado = 0.0;
        switch (operacao) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0.0) {
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("ERRO");
                    return;
                }
                break;
        }

        System.out.printf("RESULTADO: %.1f\n", resultado);
    }
}
