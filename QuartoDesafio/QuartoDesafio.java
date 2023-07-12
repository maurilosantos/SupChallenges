package QuartoDesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 	
		 	// número de linhas (testes)
		 	System.out.println("Digite o número de testes(conversões): ");
	        int N = leia.nextInt();
	        leia.nextLine();
	        
	        List<String> linhasDecifradas = new ArrayList<>();

	        for (int i = 0; i < N; i++) {
	        	 String linha;
	             do {
	                 System.out.print("Digite a frase de 2 a 100 caracteres com letra Maiúscula: ");
	                 linha = leia.nextLine();
	             } while (linha.length() < 2 || linha.length() > 100 || !linha.matches("[A-Z\\s]+"));
	            
	             String linhaDecifrada = decifrarLinha(linha);
	            linhasDecifradas.add(linhaDecifrada);
	        }
	        
	        for (String linha : linhasDecifradas) {
	            System.out.println(linha);
	        }
	    }

	    public static String decifrarLinha(String linha) {
	        int meio = linha.length() / 2;
	        StringBuilder sb = new StringBuilder();

	        for (int i = meio - 1; i >= 0; i--) {
	            sb.append(linha.charAt(i));
	        }

	        for (int i = linha.length() - 1; i >= meio; i--) {
	            sb.append(linha.charAt(i));
	        }

	        return sb.toString();

	}

}
