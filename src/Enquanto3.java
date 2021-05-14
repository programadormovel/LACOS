

import java.util.Scanner;

public class Enquanto3 {

	public static void main(String[] args) {
		
		int numero = 1, contador = 0;
		Scanner tcd = new Scanner(System.in);	
		
		while(numero != 0) {
			// processamento
			System.out.println("digite um número: ");
			numero = tcd.nextInt();
			
			if(numero >= 100 && numero <= 200) {
				contador++;
			}
		}
		
		System.out.println(contador);
	}

}
