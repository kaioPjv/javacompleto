
public class Contapaga {
	
	private String descriçao;
	private double valor;
	private String datavencimento;
	private Fornecedor fornecedor;
	private String descricao;
	
	public void ContaPagar() {
		// TODO Auto-generated constructor stub
	}
	
	public void ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.datavencimento = dataVencimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return datavencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.datavencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void pagar() {
		System.out.println("Conta paga:");
		System.out.println("Fornecedor: " + this.getFornecedor().getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Vencimento: " + this.getDataVencimento());
		System.out.println("Valor: " + this.getValor());
		System.out.println("=====================");
	}

}

