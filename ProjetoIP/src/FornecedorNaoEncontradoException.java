public class FornecedorNaoEncontradoException  extends Exception{
    public FornecedorNaoEncontradoException(){
        super("O fornecedor que você está tentando remover,não é ligado a esta loja,por favor verifique o cnpj e tente novamente.");
    }
}
