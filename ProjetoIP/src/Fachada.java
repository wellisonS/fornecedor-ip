
public class Fachada {
	//private Cadastroprodutos produto;
	//private CadastroVendas vendas;
	private CadastroFornecedor fornecedor;
	
	public Fachada(/*CadastroVendas vendas*/ /*Cadastroprodutos produto*/ CadastroFornecedor fornecedor) {
		//this.vendas = vendas;
		//this.produto = produto;
		this.fornecedor = fornecedor;
	}
	/*
	public void cadastrar(Venda venda) throws VendaJaCadastradaException {
		this.vendas.cadastrar(venda);
	}
	
	public Venda procurar(String id) throws VendaNaoEncontradaException {
		return this.vendas.procurar(id);
	}
	
	public void remover(String id) throws VendaNaoEncontradaException {
		this.vendas.remover(id);
	}
	ornecedor fornecedor
	public void atualizar(Venda venda) throws VendaNaoEncontradaException {
		this.vendas.atualizar(venda);
	}
	
	public void cadastrar(Produto produto) throws ProdutoJaCadastradoException{
		this.produto.cadastrar(produto);
	}

	public Produto procurar(String identificador) throws ProdutoNaoEncontradoException{
		return this.produto.procurar(identificador);
	}

	public void remover(String identificador)throws ProdutoNaoEncontradoException{
		this.produto.remover(identificador);
	}

	public void atualizar(Produto produtonovo) throws ProdutoNaoEncontradoException{
		this.produto.atualizar(produtonovo);
	}*/	
	
	public void cadastrar (Fornecedor fornecedor) throws FornecedorJaCadastradoException{
		  this.fornecedor.cadastrar(fornecedor);
	   }
	   public void remover (String cnpj) throws FornecedorNaoEncontradoException{
		   this.fornecedor.remover(cnpj);
	   }
	   public Fornecedor procurar (String cnpj) throws FornecedorNaoEncontradoException{
		   return this.fornecedor.procurar(cnpj);
	   }
	   public void atualizar (Fornecedor fornecedor) throws FornecedorNaoEncontradoException{
		   this.fornecedor.atualizar(fornecedor);
	   }
	
}



