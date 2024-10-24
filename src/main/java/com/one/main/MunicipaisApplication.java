package com.one.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.one.main.model.Bmgs;

@SpringBootApplication
public class MunicipaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MunicipaisApplication.class, args);
		
		Bmgs bmg = new Bmgs(
	            "BMG",         // nome
	            "São Paulo",   // cidade
	            "SP",          // uf
	            "12.345.678/0001-99",  // cnpj
	            "www.bmg.com.br",      // site
	            "senha123",    // senha
	            "bmg_login",   // login
	            "11-98765-4321", // telefone
	            "contato@bmg.com.br", // email
	            "Observações sobre a BMG", // observacoes
	            "Legenda da empresa BMG"   // legenda
	        );
	}

}
