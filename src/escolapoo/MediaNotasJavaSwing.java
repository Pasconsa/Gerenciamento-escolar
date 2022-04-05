package escolapoo;

import javax.swing.JOptionPane;

public class MediaNotasJavaSwing {

	

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe nota 1"); //jop ctrl espaço comando caixa dialogo
		String nota2 = JOptionPane.showInputDialog("Informe nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe nota 4");
		
//converta as notas strings p/ numero
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

//calcular e mostrar media
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4 ;
		JOptionPane.showMessageDialog(null, "A média é:" + media);
		
//Media para aprovação
		
		if(media >= 50) {
			
			if(media >= 70 ) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de :" + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média de :" + media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de :" + media);
		}
		
	}
}
