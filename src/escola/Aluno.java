package escola;

import java.util.Date;

public class Aluno extends Pessoa {   //aluno herda classe pessoa
	
	private Date nascimento;
	
	public void realizarAvaliação () { //metodo vazio
		
	}
	
	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	private Turma turma;  // objeto turma da classe Turma  aluno precisa apenas de uma turma


	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
