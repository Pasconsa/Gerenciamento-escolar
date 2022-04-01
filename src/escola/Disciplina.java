package escola;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private int cargaHoraria;
	
	
	
	ArrayList<Professor> professores;
	ArrayList<Turma> turmas;

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {    //regra para que não aceita valor negativo na carga horaria 
		if (cargaHoraria >=0) {							//Protegi o objeto valor irregular = Encapsulamento
		this.cargaHoraria = cargaHoraria;
		}
	}

	
	
	//metodo construtor para inicializr os atributos
	public Disciplina() {          
		professores = new ArrayList<Professor>();  //criado uma lista vazia	
		turmas = new ArrayList<Turma>();
	}
	

//criar 4 metodos para lista professores e Turmas add, excluir ,qtd, retornar posição

	public void adicionarProfessor (Professor professor) {
		professores.add(professor);
	}
	
	public void excluirProfessor(Professor professor) {  //recebe qual Professor deve ser excluida da lista
		professores.remove(professor);						// chama metodo remove professor parametro da lista Professores
	}
	
	public int quantidadeProfessores() {
		return professores.size();                //retornar o tamanho da lista com metodo size
	}
	
	public Professor getProfessores(int posicao) { //retornar a posição da lista
		return professores.get(posicao);
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
	
	
}



	
	


