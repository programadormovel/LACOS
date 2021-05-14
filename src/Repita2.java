

import java.util.Scanner;

public class Repita2 {

	public static void main(String[] args) {
		
		String condicao = "SIM";
		
		do{		
			// processamento
			System.out.println("Agora a condição vale" + condicao);
			
			// verificacao
			System.out.println("Digite SIM para continuar:");
			Scanner teclado = new Scanner(System.in);
			condicao = teclado.next();
		}while(condicao.contentEquals("SIM"));
		
		// valor final
		System.out.println("No final a condição vale " + condicao);
	}

}
