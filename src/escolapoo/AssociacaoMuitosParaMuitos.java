//obj Uma disciplina pode ter vários professores e vice versa
package escolapoo;

import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos {
	public static void main(String[] args) {
	
		Disciplina disciplina1 = new Disciplina ();
		disciplina1.setNome("Matematica");
		disciplina1.setCargaHoraria(80);
		
		Disciplina disciplina2 = new Disciplina ();
		disciplina2.setNome("Potuguês");
		disciplina2.setCargaHoraria(80);
		
		Professor professor1 = new Professor ();
		professor1.setNome("João");
		professor1.setMatricula(3432);
		professor1.setFormacaoAcademica("Licenciado");
		professor1.setSalario(5000.00); 
		
		Professor professor2 = new Professor ();
		professor2.setNome("Maria");
		professor2.setMatricula(3333);
		professor2.setFormacaoAcademica("Licenciado");
		professor2.setSalario(3000.00); 
		
		
		//relação bidirecional = João com matematica e vice versa
		professor1.adicionarDisciplina(disciplina1);  
		disciplina1.adicionarProfessor(professor1);           
		
		//professor1 chama metodo adicionar disciplina que esta na classe Professor
		//add Matematica para lista de diciplinas do pof 1 João
		
		//relação João e Portugues
		professor1.adicionarDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor1);
		
		//relação Maria e Portugues
		professor2.adicionarDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor2);
		
		//listar disciplinas do prof João = objeto professor1
		System.out.println("Disciplinas de João");
		for (int i=0 ; i < professor1.quantidadeDisciplinas();i++) {
			Disciplina disciplina =professor1.getDisciplina(i);
			System.out.println(disciplina.getNome());
			//segunda maneira de imprimir
			//System.out.println(professor1.getDisciplina(i).getNome());
		}
			//percorre a disciplina do professor 1  chama metodo for ; começa qnt zero até
			 //qnt professor1.quantidadeDisciplinas() e ;i++ contagem.
	
			//Pegar discipina
				//cria variavel Disciplina disciplina
			    //pega =professor1.getDisciplina(i); pega disciplinas
			
			//Imprimir a disciplina do professor joao
			  //System.out.println(disciplina.getNome());
			
		System.out.println(); //pular linha
		
			//listar professores da lingua Portugues
			System.out.println("Professores de Português");
			for(int i=0 ; i < disciplina2.quantidadeProfessores(); i++) {
			System.out.println(disciplina2.getProfessores(i).getNome());
			}
		
	}
}
