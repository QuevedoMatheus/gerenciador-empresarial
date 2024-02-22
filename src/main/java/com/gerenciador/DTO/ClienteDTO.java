package com.gerenciador.DTO;

import com.gerenciador.entities.enums.FormaPagamento;

public class ClienteDTO {

	private String id;
	private String razaoSocial;
	private String enderenco;
	private String telefone;
	private String emailfinanceiro;
	private String cnpj;
	private FormaPagamento pagamento;
	private String dadosBancarios;
	
	public ClienteDTO() {
		
	}

	public ClienteDTO(String id, String razaoSocial, String enderenco, String telefone, String emailfinanceiro,
			String cnpj, FormaPagamento pagamento, String dadosBancarios) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.enderenco = enderenco;
		this.telefone = telefone;
		this.emailfinanceiro = emailfinanceiro;
		this.cnpj = cnpj;
		this.pagamento = pagamento;
		this.dadosBancarios = dadosBancarios;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEnderenco() {
		return enderenco;
	}

	public void setEnderenco(String enderenco) {
		this.enderenco = enderenco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmailfinanceiro() {
		return emailfinanceiro;
	}

	public void setEmailfinanceiro(String emailfinanceiro) {
		this.emailfinanceiro = emailfinanceiro;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
}
