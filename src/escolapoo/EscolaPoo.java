//Objetivo criar prote��o para carga de horario n�o seja menor que zero
package escolapoo;

import escola.Disciplina; //importando class Disciplina

public class EscolaPoo {
	
	public static void main(String[] args) {
		
		//Instancia��o
		Disciplina disciplina1 = new Disciplina();    //Disciplina = classe ;
													//disciplina1 � uma variavel do tipo Disciplina = reserva espa�o memoria
											// new Disciplina (); = copia da clase Disciplina = novo objeto
		disciplina1.setNome("Matematica");		//se os atributos estiver em outro pacote , l� tem que estar publico ou privado
	
		disciplina1.setCargaHoraria(-10); // na classe diciplina a prote��o contra valor zero
		
		System.out.println(disciplina1.getNome());
		System.out.println(disciplina1.getCargaHoraria());
	}
}
