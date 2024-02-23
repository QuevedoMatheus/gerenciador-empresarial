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
@Table(name= "tb_cadastrosaidas")
public class CadastroSaidas implements Serializable {
	
	private static final long serialVersionUID =1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String CNPJ;
	private Integer NF;
	
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private FormaPagamento pagamento;
	private Integer numeroParcelas;
	private Integer vencimento;
	private String centroCusto;
	
	public CadastroSaidas() {
		
	}

	public CadastroSaidas(Long id, String CNPJ, Integer NF, String descricao, FormaPagamento pagamento,
			Integer numeroParcelas, Integer vencimento, String centroCusto) {
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

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public Integer getNF() {
		return NF;
	}

	public void setNF(Integer NF) {
		this.NF = NF;
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

	public Integer getVencimento() {
		return vencimento;
	}

	public void setVencimento(Integer vencimento) {
		this.vencimento = vencimento;
	}

	public String getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
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
		CadastroSaidas other = (CadastroSaidas) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
