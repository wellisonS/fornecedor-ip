public class Fornecedor  extends PessoaAbstrata{
   //CLASSE BASE
    private String tipoProduto;
    private String cnpj;
    private String nomeFantasia;
    public Fornecedor(String nome,String endereco,String contato,String tipoProduto,String cnpj,String nomeFantasia) {
        super (nome,endereco,contato);
    	this.tipoProduto = tipoProduto;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        
    }
    public String getTipoProduto() {
        return tipoProduto;
    }
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


}
