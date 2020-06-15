package entidades;

import javax.swing.JOptionPane;

public class Pao extends Produto{
	
	private String marcaFarinha;

	public String getMarcaFarinha() {
		return marcaFarinha;
	}

	public void setMarcaFarinha(String marcaFarinha) {
		this.marcaFarinha = marcaFarinha;
	}
	
	@Override
	public void descricao() {
		JOptionPane.showMessageDialog(null, "Nome : "+super.getNome()+
											"\nPreco : "+super.getPreco()+
											"\nMarca da Farinha : "+marcaFarinha);
	}

}
