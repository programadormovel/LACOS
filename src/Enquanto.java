

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador < 10) {
			
			// processamento
			System.out.println("Agora o contador vale" + contador);
			
			// incremento
			contador ++;
		}
		
		// valor final
		System.out.println("No final o contador vale " + contador);
	}

}
