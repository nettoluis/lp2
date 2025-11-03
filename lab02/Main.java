package JogoDoBicho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			Jogo jogo = new Jogo();
			
			String entrada = "", saida = "";
			do {
				entrada = leitor.nextLine();
				int[] apostas = jogo.fazAposta();
				saida = jogo.imprimeAposta(apostas);
				System.out.println(saida);
				
			} while(!entrada.equals("."));
			
		}
	}
}
