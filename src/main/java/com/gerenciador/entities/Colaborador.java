package com.gerenciador.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_colaborador")
public class Colaborador implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Integer nascimento;
	private String mae;
	private String pai;
	
	@Column(columnDefinition = "TEXT")
	private String endereco;
	
	@Column(unique = true)
	private String RG;
	
	@Column(unique = true)
	private String CPF;
	
	@Column(unique = true)
	private String NIS;
	
	private String CBO;
	private String funcao;
	private Integer admissao;
	private float salario;
	private Boolean cestaBasica;
	private float transporte;
	private float salarioBase;
	private float salarioBruto;
	private float salarioLiquido;
	private Boolean demissao;
	private Integer dataAdmissao;
	
	@Column(columnDefinition = "TEXT")
	private String motivoDemissao;
	
	public Colaborador() {
		
	}

	public Colaborador(Long id, String nome, Integer nascimento, String mae, String pai, String endereco, String RG, String CPF,
			String NIS, String CBO, String funcao, Integer admissao, float salario, Boolean cestaBasica, float transporte,
			float salarioBase, float salarioBruto, float salarioLiquido, Boolean demissao, Integer dataAdmissao,
			String motivoDemissao) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.mae = mae;
		this.pai = pai;
		this.endereco = endereco;
		this.RG = RG;
		this.CPF = CPF;
		this.NIS = NIS;
		this.CBO = CBO;
		this.funcao = funcao;
		this.admissao = admissao;
		this.salario = salario;
		this.cestaBasica = cestaBasica;
		this.transporte = transporte;
		this.salarioBase = salarioBase;
		this.salarioBruto = salarioBruto;
		this.salarioLiquido = salarioLiquido;
		this.demissao = demissao;
		this.dataAdmissao = dataAdmissao;
		this.motivoDemissao = motivoDemissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNascimento() {
		return nascimento;
	}

	public void setNascimento(Integer nascimento) {
		this.nascimento = nascimento;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getNIS() {
		return NIS;
	}

	public void setNIS(String NIS) {
		this.NIS = NIS;
	}

	public String getCBO() {
		return CBO;
	}

	public void setCBO(String CBO) {
		this.CBO = CBO;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Integer getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Integer admissao) {
		this.admissao = admissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Boolean getCestaBasica() {
		return cestaBasica;
	}

	public void setCestaBasica(Boolean cestaBasica) {
		this.cestaBasica = cestaBasica;
	}

	public float getTransporte() {
		return transporte;
	}

	public void setTransporte(float transporte) {
		this.transporte = transporte;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public float getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(float salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public Boolean getDemissao() {
		return demissao;
	}

	public void setDemissao(Boolean demissao) {
		this.demissao = demissao;
	}

	public Integer getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Integer dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getMotivoDemissao() {
		return motivoDemissao;
	}

	public void setMotivoDemissao(String motivoDemissao) {
		this.motivoDemissao = motivoDemissao;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
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
		Colaborador other = (Colaborador) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
