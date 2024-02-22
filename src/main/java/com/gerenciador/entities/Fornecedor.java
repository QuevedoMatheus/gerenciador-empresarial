package com.gerenciador.entities;

import java.util.Objects;

import com.gerenciador.entities.enums.FormaPagamento;

public class Fornecedor {
	
	private Long id;
	private String razaoSocial;
	private String endereco;
	private String telefoneComercial;
	private String emailFinanceiro;
	private String emailComercial;
	private String CNPJ;
	private String inscricaoEstadual;
	private String CEIObra;
	private FormaPagamento pagamento;
	private String dadosBancarios;
	
	public Fornecedor() {
		
	}

	public Fornecedor(Long id, String razaoSocial, String endereco, String telefoneComercial, String emailFinanceiro,
			String emailComercial, String CNPJ, String inscricaoEstadual, String CEIObra, FormaPagamento pagamento,
			String dadosBancarios) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.telefoneComercial = telefoneComercial;
		this.emailFinanceiro = emailFinanceiro;
		this.emailComercial = emailComercial;
		this.CNPJ = CNPJ;
		this.inscricaoEstadual = inscricaoEstadual;
		this.CEIObra = CEIObra;
		this.pagamento = pagamento;
		this.dadosBancarios = dadosBancarios;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getEmailFinanceiro() {
		return emailFinanceiro;
	}

	public void setEmailFinanceiro(String emailFinanceiro) {
		this.emailFinanceiro = emailFinanceiro;
	}

	public String getEmailComercial() {
		return emailComercial;
	}

	public void setEmailComercial(String emailComercial) {
		this.emailComercial = emailComercial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCEIObra() {
		return CEIObra;
	}

	public void setCEIObra(String CEIObra) {
		this.CEIObra = CEIObra;
	}

	public FormaPagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}

	public String getDadosBancarios() {
		return dadosBancarios;
	}

	public void setDadosBancarios(String dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
