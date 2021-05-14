

import java.util.Scanner;

public class Repita {

	public static void main(String[] args) {
		
		int contador = 0;
		
		do {
			// processamento
			System.out.println("Agora o contador vale" + contador);
			
			// incremento
			contador ++;
		}while(contador < 10);
		
		// valor final
		System.out.println("No final o contador vale " + contador);
	}

}
