//Objetivo criar proteção para carga de horario não seja menor que zero
package escolapoo;

import escola.Disciplina; //importando class Disciplina

public class EscolaPoo {
	
	public static void main(String[] args) {
		
		//Instanciação
		Disciplina disciplina1 = new Disciplina();    //Disciplina = classe ;
													//disciplina1 é uma variavel do tipo Disciplina = reserva espaço memoria
											// new Disciplina (); = copia da clase Disciplina = novo objeto
		disciplina1.setNome("Matematica");		//se os atributos estiver em outro pacote , lá tem que estar publico ou privado
	
		disciplina1.setCargaHoraria(-10); // na classe diciplina a proteção contra valor zero
		
		System.out.println(disciplina1.getNome());
		System.out.println(disciplina1.getCargaHoraria());
	}
}
