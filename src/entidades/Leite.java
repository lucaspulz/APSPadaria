package entidades;

import javax.swing.JOptionPane;

public class Leite extends Produto{
	private String tipo;

	public String isTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo=="Integral") {
		this.tipo = tipo;
		}
		else if(tipo=="Integral") {
		this.tipo = tipo;
	}
		else {
			JOptionPane.showMessageDialog(null, "N�o Temos esse Tipo de Leite");
		}
		
	
		
	}
	@Override
	public void descricao() {
	
	JOptionPane.showMessageDialog(null, "Nome : "+super.getNome()+
										"Pre�o: " +super.getPreco()+
										"Tipo de Leite : "+tipo);

}
}