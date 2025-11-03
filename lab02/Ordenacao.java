package JogoDoBicho;

public class Ordenacao {
	
	public static void swap(int[] s, int i1, int i2) {
		int temp = s[i1];
		s[i1] = s[i2];
		s[i2] = temp;
	}
	
	public static void bubbleSort(int[] sequencia) {
		boolean swapped = false;
		
		while (true) {
			for (int i = 0; i < (sequencia.length - 1); ++i) {
				if (sequencia[i] > sequencia[i + 1]) {
					swap(sequencia, i, i + 1);
					swapped = true;
				}
			}
			
			if (!swapped) {
				break;
			}
		}
	}
}
