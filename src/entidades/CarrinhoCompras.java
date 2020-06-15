package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CarrinhoCompras {
	
	public static List<Produto> produtos = new ArrayList();
	
	public void salvaProdutos(Produto prod) {
		if(produtos.size()>5) {
			JOptionPane.showMessageDialog(null, "Não é Possivel salvar mais que 5");
		}
		produtos.add(prod);
	}
	public void calculaTotal() {
		for(int i=0;i<produtos.size();i++ ) {
			double soma =+ produtos.get(i).getPreco();
			JOptionPane.showMessageDialog(null, "Valor Total das Compras é : R$ "+soma);
		}
	}
	public void listaProdutos() {
		String mostra = "Lista de Produtos : \n";
		for(Produto prod : produtos) {
			mostra += ("Nome :".concat(prod.getNome()).concat("\n"))
						.concat("Preço:".concat(prod.getPreco()+"").concat("\n"))
						.concat("Marca:".concat(prod.getMarca()).concat("\n"))
						.concat("\n".concat("---------------------------------------------").concat("\n"));		
			
		}
		JOptionPane.showMessageDialog(null, mostra);
		
	}
	
	
	

}
