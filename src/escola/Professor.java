package escola;

import java.util.ArrayList;

public class Professor extends Pessoa {
	
	private String formacaoAcademica;
	private double salario;
	
	void aplicarAvaliacao() {
		
	}
	
	//------------------------------------------------------------------

	private ArrayList<Turma> turmas;
	private ArrayList<Disciplina> disciplinas;
	
	//----------------------------------------------------------------
	
	public Professor() {
	turmas = new ArrayList<Turma>();
	disciplinas = new ArrayList<Disciplina>();
	}
	
	//-------------------------------------------------------------
	
	public void adicionarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	

	public void excluirDisciplina(Disciplina disciplina) {  //recebe qual Disciplina deve ser excluida da lista
		disciplinas.remove(disciplina);						// chama metodo remove disciplina parametro da lista Diciplinas
	}
	
	public int quantidadeDisciplinas() {
		return disciplinas.size();                //retornar o tamanho da lista com metodo size
	}
	
	public Disciplina getDisciplina(int posicao) { //retornar a posição da lista
		return disciplinas.get(posicao);
	}

	
	
	
	public void adicionarTurma(Turma turma) {
		turmas.add(turma);
	}
	

	public void excluirTurma(Turma turma) {  
		turmas.remove(turma);						
	}
	
	public int quantidadeTurmas() {
		return turmas.size();                
	}
	
	public Turma getTurmas(int posicao) { 
		return turmas.get(posicao);
	}
	
	//------------------------------------------------------------------------------
	
	//geter setter atributos nativos	
	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}
	
	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
}

	


