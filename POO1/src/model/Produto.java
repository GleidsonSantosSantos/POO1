package model;

public class Produto {
	public String nome;
	public float preco;
	public int qtdEstoque;

	public Produto(String nome, float preco, int qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}

	public float valorTotalEstoque() {
		return preco * qtdEstoque;
	}

	public boolean estaDisponivel() {
		return qtdEstoque > 0;
	}

	public boolean verificarProdutoDisponivel(String nomeProduto) {
		return this.nome.equals(nomeProduto) && estaDisponivel();
	}

	public boolean disponivelNoEstoque(String nomeProduto) {
		return this.nome.equals(nomeProduto) && estaDisponivel();
	}

	public void adicionarQuantidade(int quantidade) {
		if (quantidade > 0) {
			qtdEstoque += quantidade;
		} else {
			System.out.println("A quantidade a adicionar deve ser maior que zero.");
		}
	}

	public void removerQuantidade(int quantidade) {
		if (quantidade > 0 && quantidade <= qtdEstoque) {
			qtdEstoque -= quantidade;
		} else {
			System.out.println("A quantidade a remover deve ser maior que zero e menor ou igual ao estoque atual.");
		}
	}
	
	 public void exibirInformacoes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Preço: R$" + preco);
	        System.out.println("Quantidade em estoque: " + qtdEstoque);
	        System.out.println("Valor total em estoque: R$" + valorTotalEstoque());
	        System.out.println("Disponível: " + (estaDisponivel() ? "Sim" : "Não"));
	    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}




}
