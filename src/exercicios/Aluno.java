package exercicios;

public class Aluno {
	String nome;
	double p1;
	double p2;
	double p3;
	double p4;
	double mediaFinal;
	
	public void calcularMedia() {
		// calcula da m�dia
		mediaFinal = (p1 + p2 + p3) / 3;
		// Arredondamentos
		//mediaFinal = Math.round(mediaFinal);  //arredondamento por aproxima��o
		//mediaFinal = Math.ceil(mediaFinal);  //arredondamento para cima
		//mediaFinal = Math.floor(mediaFinal); //arredondamento para baixo
	}
}
