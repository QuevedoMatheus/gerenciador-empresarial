package com.gerenciador.DTO;

import java.util.Date;

import com.gerenciador.entities.enums.FormaPagamento;

public class CadastroSaidasDTO {

	private Long id;
	private String CNPJ;
	private Integer NF;
	private String descricao;
	private FormaPagamento pagamento;
	private Integer numeroParcelas;
	private Date vencimento;
	private String centroCusto;
	
	public CadastroSaidasDTO() {
		
	}

	public CadastroSaidasDTO(Long id, String CNPJ, Integer NF, String descricao, FormaPagamento pagamento,
			Integer numeroParcelas, Date vencimento, String centroCusto) {
		this.id = id;
		this.CNPJ = CNPJ;
		this.NF = NF;
		this.descricao = descricao;
		this.pagamento = pagamento;
		this.numeroParcelas = numeroParcelas;
		this.vencimento = vencimento;
		this.centroCusto = centroCusto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Integer getNF() {
		return NF;
	}

	public void setNF(Integer nF) {
		NF = nF;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public FormaPagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public String getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}
}
