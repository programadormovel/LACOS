package exercicios;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double p1, p2, p3;
		double mediaFinal;
		Scanner tcd = new Scanner(System.in);
		
		// la�o para...fa�a
		for(int cont = 1; cont <= 10; cont++) {
			// Solicitar as notas
			System.out.println("\n NOTAS DO ALUNO " + cont + ":");
			System.out.println("Entre com a nota 1: ");
			p1 = tcd.nextDouble();
			System.out.println("Entre com a nota 2: ");
			p2 = tcd.nextDouble();
			System.out.println("Entre com a nota 3: ");
			p3 = tcd.nextDouble();
			
			// calcula da m�dia
			mediaFinal = (p1 + p2 + p3) / 3;
			
			System.out.println("M�dia do Aluno " + cont + " � " + mediaFinal);
		}

	}

}
