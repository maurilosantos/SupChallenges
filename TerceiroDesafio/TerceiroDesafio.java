package TerceiroDesafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 	Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos 
	do array em que a sua diferença seja igual ao valor alvo.
 */

public class TerceiroDesafio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor alvo: ");
        int alvo = scanner.nextInt();

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];
        System.out.print("Digite os números do array separados por espaço: ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        int count = countPairsWithTargetDifference(array, alvo);
        System.out.println("Número de pares com diferença alvo: " + count);
    }

    public static int countPairsWithTargetDifference(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : array) {
            int complement = num - target;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            int complement2 = num + target;
            if (map.containsKey(complement2)) {
                count += map.get(complement2);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
		
	}


