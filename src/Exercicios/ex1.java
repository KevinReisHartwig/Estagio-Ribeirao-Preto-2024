package Exercicios;

public class ex1 {
	public static void main(String[] args) {
		int INDICE = 13, SOMA = 0, K = 0;

		while (K < INDICE) {
			K = K + 1;
			SOMA = SOMA + K;
		}

		System.out.println(SOMA);
	}

	// Ao final do processamento, qual será o valor da variável SOMA? 91

}