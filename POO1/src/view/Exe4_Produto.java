package view;

import java.util.Locale;

import model.Produto;

public class Exe4_Produto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		 Produto produto1 = new Produto("Produto e", 1.50f, 0);
	        produto1.exibirInformacoes();

	    
	        produto1.adicionarQuantidade(5);
	        produto1.exibirInformacoes();

	        produto1.removerQuantidade(10);
	        produto1.exibirInformacoes();

	        System.out.println( produto1.getNome()+ " está disponível no estoque? " + produto1.disponivelNoEstoque("Produto e"));
	    }
	}