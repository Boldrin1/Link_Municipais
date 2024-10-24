package com.one.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bmgs {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public String Empresa;
	
	public String Cidade;
	
	public String UF;
	
	public String CNPJ;
	
	public String Site;
	
	public String Senha;
	
	public String Login;
	
	public String Telefone;
	
	public String Email;
	
	public String Obeservacoes;
	
	public String Legenda;

	public Bmgs(String empresa, String cidade, String uF, String cNPJ, String site, String senha, String login,
			String telefone, String email, String obeservacoes, String legenda) {
		super();
		Empresa = empresa;
		Cidade = cidade;
		UF = uF;
		CNPJ = cNPJ;
		Site = site;
		Senha = senha;
		Login = login;
		Telefone = telefone;
		Email = email;
		Obeservacoes = obeservacoes;
		Legenda = legenda;
	}

	public Bmgs() {
		super();
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getSite() {
		return Site;
	}

	public void setSite(String site) {
		Site = site;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getObeservacoes() {
		return Obeservacoes;
	}

	public void setObeservacoes(String obeservacoes) {
		Obeservacoes = obeservacoes;
	}

	public String getLegenda() {
		return Legenda;
	}

	public void setLegenda(String legenda) {
		Legenda = legenda;
	}
	
	
	
}
