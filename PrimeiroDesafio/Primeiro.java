package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/*
 * 	Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo 
 * 	o seguinte critério:
		• Primeiro os Pares
		• Depois os Ímpares
	Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
	em ordem decrescente.
	
	A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 10^5) Este é o
	número de linhas de entrada.
 * */

public class Primeiro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a quantidade de Linhas: ");
		int N = leia.nextInt();

		while (N <= 1 || N > 10000) {
			System.out.println("O número de linhas precisa estar entre 1 exclusive e 10.000 inclusive. Insira novamente: ");
			N = leia.nextInt();
		}

		List<Integer> numeros = new ArrayList<>();
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			System.out.println("Inserir o número: ");
			int numero = leia.nextInt();
			if (numero > 0) {
				numeros.add(numero);
			} else {
				System.out.println("Insira um inteiro positivo!\n");
				i--;
			}

		}

		for (int numero : numeros) {
			if (numero % 2 == 0) {
				pares.add(numero);
			} else {
				impares.add(numero);
			}
		}

		pares.sort(null);
		impares.sort(Comparator.reverseOrder());

		System.out.println("Números ordenados:\n");
		for (int numero : pares) {
			System.out.println(numero);
		}

		for (int numero : impares) {
			System.out.println(numero);
		}

	}

}
