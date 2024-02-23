package com.gerenciador.entities;

import java.io.Serializable;
import java.util.Objects;

import com.gerenciador.entities.enums.FormaPagamento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID =1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String razaoSocial;

	@Column(columnDefinition = "TEXT")
	private String enderenco;
	private String telefone;
	private String emailfinanceiro;
	
	@Column(unique = true)
	private String cnpj;
	
	private FormaPagamento pagamento;
	@Column(columnDefinition = "TEXT")
	
	private String dadosBancarios;
	
	public Cliente() {
		
	}

	public Cliente(Long id, String razaoSocial, String enderenco, String telefone, String emailfinanceiro,
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	
	
}
