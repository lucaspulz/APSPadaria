package entidades;

import javax.swing.JOptionPane;

public class Produto {
	private String nome;
	private double preco;
	private String marca;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void descricao() {
		JOptionPane.showMessageDialog(null, "Nome : "+nome+
											"\nPreco : "+preco+
											"\nMarca : "+marca);
	}

}
