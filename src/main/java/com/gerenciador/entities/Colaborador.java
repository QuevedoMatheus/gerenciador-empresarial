package com.gerenciador.entities;

import java.util.Date;
import java.util.Objects;

public class Colaborador {
	
	private Long ID;
	private String nome;
	private Date nascimento;
	private String mae;
	private String pai;
	private String endereco;
	private String RG;
	private String CPF;
	private String NIS;
	private String CBO;
	private String funcao;
	private Date admissao;
	private float salario;
	private Boolean cestaBasica;
	private float transporte;
	private float salarioBase;
	private float salarioBruto;
	private float salarioLiquido;
	private Boolean demissao;
	private Date dataAdmissao;
	private String motivoDemissao;
	
	public Colaborador() {
		
	}

	public Colaborador(Long ID, String nome, Date nascimento, String mae, String pai, String endereco, String rG, String cPF,
			String nIS, String cBO, String funcao, Date admissao, float salario, Boolean cestaBasica, float transporte,
			float salarioBase, float salarioBruto, float salarioLiquido, Boolean demissao, Date dataAdmissao,
			String motivoDemissao) {
		this.ID = ID;
		this.nome = nome;
		this.nascimento = nascimento;
		this.mae = mae;
		this.pai = pai;
		this.endereco = endereco;
		RG = rG;
		CPF = cPF;
		NIS = nIS;
		CBO = cBO;
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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
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

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNIS() {
		return NIS;
	}

	public void setNIS(String nIS) {
		NIS = nIS;
	}

	public String getCBO() {
		return CBO;
	}

	public void setCBO(String cBO) {
		CBO = cBO;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
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

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getMotivoDemissao() {
		return motivoDemissao;
	}

	public void setMotivoDemissao(String motivoDemissao) {
		this.motivoDemissao = motivoDemissao;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
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
		Colaborador other = (Colaborador) obj;
		return Objects.equals(ID, other.ID);
	}
	
	

}
