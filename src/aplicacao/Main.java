package aplicacao;

import entidades.CarrinhoCompras;
import entidades.Leite;
import entidades.OutrosProdutos;
import entidades.Pao;
import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		
		CarrinhoCompras cc = new CarrinhoCompras();
		
		Leite leite = new Leite();
		OutrosProdutos op = new OutrosProdutos();
		OutrosProdutos op2 = new OutrosProdutos();
		Pao pao = new Pao();
		
		leite.setNome("Leite");
		leite.setMarca("Santa Clara");
		leite.setPreco(6.50);
		leite.setTipo("Integral");
		
		pao.setNome("Pão ");
		pao.setMarca("Francês");
		pao.setPreco(3.00);
		pao.setMarcaFarinha("Top");
		
		op.setNome("Queijo");
		op.setMarca("Top da Colonia");
		op.setPreco(21.00);
		
		op2.setNome("Salame");
		op2.setMarca("Santo André");
		op2.setPreco(9.00);
		
		cc.salvaProdutos(leite);
		cc.salvaProdutos(pao);
		cc.salvaProdutos(op);
		cc.salvaProdutos(op2);
		cc.listaProdutos();
	}

}
