package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaração do objeto aluno
		Aluno aluno = new Aluno();
		// Declaração do objeto listaDeAlunos
		List<Aluno> listaDeAlunos = new ArrayList<>();
		// Atribuição dos dados da primeira aluna
		aluno.nome = "Débora";
		aluno.p1 = 10.0;
		aluno.p2 = 6.0;
		aluno.p3 = 7.0;
		aluno.p4 = 4.0;
		// Aluna inserida na lista de alunos
		listaDeAlunos.add(aluno);
		// Reinicialização do objeto aluno
		aluno = new Aluno();
		// Atribuição dos dados do segundo aluno
		aluno.nome = "Marcos";
		aluno.p1 = 0.0;
		aluno.p2 = 3.0;
		aluno.p3 = 7.0;
		aluno.p4 = 2.0;
		// Aluno inserido na lista de alunos
		listaDeAlunos.add(aluno);
		
		// laço para...faça
		for(Aluno alunoAtual: listaDeAlunos) {
			alunoAtual.calcularMedia();
			
			// Média final deste aluno atual
			System.out.println("Média da(o) Aluna(o) " + alunoAtual.nome + " é " + alunoAtual.mediaFinal);
		}
	}
}
