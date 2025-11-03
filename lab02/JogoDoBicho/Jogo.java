package JogoDoBicho;

import java.util.Arrays;

public class Jogo {
	private String[] bichos = {"Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho",
			"Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca"};
	
	public boolean estaContido(int numero, int[] apostas) {
		for (int aposta : apostas) {
			if (aposta == numero) {
				return true;
			}
		}
		
		return false;
	}
	public String pegaBicho(int numero) {
		return this.bichos[numero - 1];
	}
	
	public int[] fazAposta() {
		int[] apostas = new int[5];
		
		int numero = 0;
		for (int i = 0; i < 5; ++i) {
			do {
			numero = (int) (Math.random() * 100) % 25 + 1; 
			} while (estaContido(numero, apostas));
			
			apostas[i] = numero;
		}
		Arrays.sort(apostas);
		return apostas;
	}
	
	public String imprimeAposta(int[] apostas) {
		String saida = "";
		
		for (int i = 0; i < apostas.length; ++i) {
			saida += i != 0 ? " " + pegaBicho(apostas[i]) : pegaBicho(apostas[i]);
		}
		
		return saida;
	}
}
