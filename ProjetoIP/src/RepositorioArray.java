public class RepositorioArray implements Repositorio {
    private Fornecedor [] fornecedor;
    private  int index ;
    public RepositorioArray(){
        this.fornecedor = new Fornecedor [100];
        this.index = 0;
    }

    public int getIndice(String cnpj){
        int fornecedor  = -1;
        boolean falsoBreak = false;
        for (int i = 0; i < this.index && !falsoBreak;i++){
            if (this.fornecedor[this.index].getCnpj().equals(cnpj)){
                fornecedor = i;
                falsoBreak = true;

            }
        }

        return fornecedor;
    }
    @Override
    public void remover(String cnpj) throws FornecedorNaoEncontradoException {
        int i = this.getIndice(cnpj);
        if (i == this.index){
            throw new FornecedorNaoEncontradoException();
        } else {
            this.index = index -1 ;
            this.fornecedor[i] = this.fornecedor[this.index];
            this.fornecedor[this.index] = null;
        }
    }

    @Override
    public Fornecedor procurar(String cnpj) throws FornecedorNaoEncontradoException {
        Fornecedor fornecedor  = null;
        boolean falsoBreak = false;
        for (int i = 0; i < this.index && !falsoBreak;i++){
            if (this.fornecedor[this.index].getCnpj().equals(cnpj)){
                fornecedor = this.fornecedor[i];
                falsoBreak = true;

            }
        }


        return fornecedor;
    }

   
   
    @Override
    public void cadastrar(Fornecedor fornecedor) throws FornecedorJaCadastradoException {

        for (int i = 0; i < this.index;i++){
            if (this.fornecedor[i].getCnpj().equals(fornecedor.getCnpj())){
                throw new FornecedorJaCadastradoException();
            }
        }
        this.fornecedor[this.index] = fornecedor;
        this.index++;


    }

    @Override
    public void atualizar(Fornecedor fornecedor) throws FornecedorNaoEncontradoException {
        int i = this.getIndice(fornecedor.getCnpj());
        if (i == this.index){
            throw  new FornecedorNaoEncontradoException();
        } else {
            this.fornecedor[i] = fornecedor;
        }
    }
   @Override
	public boolean existe(String cnpj) {
	  boolean teste = false;
	  int i = 0;
	  while (i < this.index && teste == false) {
		 if(fornecedor[i].getCnpj().equals(cnpj)) {
			teste = true;
		 }else {
			 i++;
		 }
		 
	  }
	 return teste;
		
	}
}
