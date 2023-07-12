package SegundoDesafio;
/*
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor 
	monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor 
	pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas 
	possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
	necessárias.
	O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 */

import java.util.Scanner;

public class SegundoDesafio {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	System.out.println("Digite o valor monetário: ");
	double N = leia.nextDouble();

	while (N < 0 || N > 1000000.00) {
		System.out.println("O valor monetário precisa estar entre 0 inclusive e 1000000.00 inclusive. Insira novamente: ");
		N = leia.nextDouble();
	}
	
	int[] notas = {100, 50, 20, 10, 5, 2};
    double[] moedas = {1, 0.5, 0.25, 0.1, 0.05, 0.01};
    
    System.out.println("NOTAS:");
    for (int i = 0; i < notas.length; i++) {
        int quantidadeNotas = (int) (N / notas[i]);
        N %= notas[i];
        System.out.println(quantidadeNotas + " nota(s) de R$" + notas[i] + ",00");
    }

    System.out.println("MOEDAS:");
    for (int i = 0; i < moedas.length; i++) {
        int quantidadeMoedas = (int) (N / moedas[i]);
        N %= moedas[i];
        System.out.println(quantidadeMoedas + " moeda(s) de R$" + String.format("%.2f", moedas[i]));
    }
	
	
	
	}

}
