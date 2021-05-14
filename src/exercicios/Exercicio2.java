package exercicios;
public class Exercicio2 {

	public static void main(String[] args) {
		double chico = 1.5;
		double juca = 1.1;
		int anos = 0;
		
		while(juca <= chico) {
			anos = anos + 1;
			chico = chico + 0.02;
			juca = juca + 0.03;
			
			System.out.println("Tamanho do Juca " + juca);
			System.out.println("Tamanho do Chico " + chico);
		}
		
		System.out.println("Tamanho do Juca " + juca);
		System.out.println("Tamanho do Chico " + chico);
		System.out.println("Levaram " + anos + " anos!");

	}

}
