package escola;

import java.util.ArrayList;

public class Turma {
	private String sigla;
	private int ano;
	
	void adicionarAluno() {
		
	}
	
//associação de elementos entre aluno e turma chama vetor (varios alunos em uma turma por isso a lista)
	private ArrayList<Aluno>alunos;
	private ArrayList<Professor>professores;
	private ArrayList<Disciplina>disciplinas;
	
	
	
//criar um metodo construtor p/ lista vazia de alunos, professores, diciplinas
	public Turma() {
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();
		disciplinas = new ArrayList<Disciplina>();
	}
	
	
	
//metodos para as listas  => adicionar , excluir , pegar e quantidade
	
	public void adicionarAluno(Aluno aluno) { //receber um objeto aluno da classe Aluno)
		alunos.add(aluno);    //adicionar aluno na lista de alunos
	}
	
	public int quantidadeAlunos() { //,pegar a quantidade de alunos que esta na lista
		return alunos.size();
	}
	
	public void excluirAluno(Aluno aluno) { //remover aluno da lista
		alunos.remove(aluno);
	}
	
	public Aluno getAluno(int posicao) {  //receber a posição do aluno na lista
		return alunos.get(posicao);
	}

	

// lista professores => adicionar, excluir e quantidade.
	public void adicionarProfessor(Professor professor) { 
		professores.add(professor);  
	}	
	
	public int quantidadeProfessores() { 
		return professores.size();
	}
	
	public void excluirProfessor(Professor professor) { 
		professores.remove(professor);
	}	
		

	
// lista disciplinas => adicionar, excluir e quantidade.	
		
	public void adicionarDisciplinas(Disciplina disciplina)	{
		disciplinas.add(disciplina);
	}
		
	public int quantidadeDisciplinas() { 
		return disciplinas.size();
	}
	
	public void excluirDisciplina(Disciplina disciplina) { 
		disciplinas.remove(disciplina);
	}	
	
	
	
	
//geter setter atributos nativos	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
	
	
}
		
		

	
	
	
	