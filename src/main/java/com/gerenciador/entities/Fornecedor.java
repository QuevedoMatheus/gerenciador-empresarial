package com.gerenciador.entities;

import java.util.Objects;

import com.gerenciador.entities.enums.FormaPagamento;

public class Fornecedor {
	
	private Long ID;
	private String razaoSocial;
	private String endereço;
	private String telefoneComercial;
	private String emailFinanceiro;
	private String emailComercial;
	private String CNPJ;
	private String InscricaoEstadual;
	private String CEIObra;
	private FormaPagamento pagamento;
	private String dadosBancarios;
	
	public Fornecedor() {
		
	}

	public Fornecedor(Long iD, String razaoSocial, String endereço, String telefoneComercial, String emailFinanceiro,
			String emailComercial, String cNPJ, String inscricaoEstadual, String cEIObra, FormaPagamento pagamento,
			String dadosBancarios) {
		ID = iD;
		this.razaoSocial = razaoSocial;
		this.endereço = endereço;
		this.telefoneComercial = telefoneComercial;
		this.emailFinanceiro = emailFinanceiro;
		this.emailComercial = emailComercial;
		CNPJ = cNPJ;
		InscricaoEstadual = inscricaoEstadual;
		CEIObra = cEIObra;
		this.pagamento = pagamento;
		this.dadosBancarios = dadosBancarios;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getInscricaoEstadual() {
		return InscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		InscricaoEstadual = inscricaoEstadual;
	}

	public String getCEIObra() {
		return CEIObra;
	}

	public void setCEIObra(String cEIObra) {
		CEIObra = cEIObra;
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
		return Objects.hash(ID);
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
		return Objects.equals(ID, other.ID);
	}
	
	
	
	

}
