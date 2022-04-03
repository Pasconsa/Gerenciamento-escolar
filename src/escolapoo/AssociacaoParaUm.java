package escolapoo;

import java.util.Date;

import escola.Aluno;
import escola.Turma;

public class AssociacaoParaUm {

	public static void main(String[] args) {
		
		
		//objetivo associar aluno com turma  =  Aluno tem turma
		
		Turma turma1 = new Turma();   //new Turma = metodo construtor=> função construir inicializar objeto objeto
		turma1.setSigla("1A");
		turma1.setAno(1);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Joao");
		aluno1.setMatricula(123);
		aluno1.setNascimento(new Date());
		aluno1.setTurma(turma1);
		turma1.adicionarAluno(aluno1);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Ze");
		aluno2.setMatricula(999);
		aluno2.setNascimento(new Date());
		aluno2.setTurma(turma1);
		turma1.adicionarAluno(aluno2);
		
		System.out.println("Dados do aluno 1");
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getTurma().getSigla());
		
		System.out.println();
		
		System.out.println("Alunos da turma");                //estrutura repetição turma e aluno
		for(int i=0; i < turma1.quantidadeAlunos(); i++) {
			System.out.println(turma1.getAluno(i).getNome());
		}
	}

}
