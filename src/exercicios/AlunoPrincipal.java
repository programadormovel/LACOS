package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declara��o do objeto aluno
		Aluno aluno = new Aluno();
		// Declara��o do objeto listaDeAlunos
		List<Aluno> listaDeAlunos = new ArrayList<>();
		// Atribui��o dos dados da primeira aluna
		aluno.nome = "D�bora";
		aluno.p1 = 10.0;
		aluno.p2 = 6.0;
		aluno.p3 = 7.0;
		aluno.p4 = 4.0;
		// Aluna inserida na lista de alunos
		listaDeAlunos.add(aluno);
		// Reinicializa��o do objeto aluno
		aluno = new Aluno();
		// Atribui��o dos dados do segundo aluno
		aluno.nome = "Marcos";
		aluno.p1 = 0.0;
		aluno.p2 = 3.0;
		aluno.p3 = 7.0;
		aluno.p4 = 2.0;
		// Aluno inserido na lista de alunos
		listaDeAlunos.add(aluno);
		
		// la�o para...fa�a
		for(Aluno alunoAtual: listaDeAlunos) {
			alunoAtual.calcularMedia();
			
			// M�dia final deste aluno atual
			System.out.println("M�dia da(o) Aluna(o) " + alunoAtual.nome + " � " + alunoAtual.mediaFinal);
		}
	}
}
