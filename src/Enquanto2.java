

import java.util.Scanner;

public class Enquanto2 {

	public static void main(String[] args) {
		
		String condicao = "SIM";
		
		while(condicao.contentEquals("SIM")) {
			
			// processamento
			System.out.println("Agora a condição vale" + condicao);
			
			// verificacao
			System.out.println("Digite SIM para continuar:");
			Scanner teclado = new Scanner(System.in);
			condicao = teclado.next();
		}
		
		// valor final
		System.out.println("No final a condição vale " + condicao);
	}

}
