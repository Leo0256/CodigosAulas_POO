package com.app;

public class Empresa {
	private String cnpj;
	private String razaoSocial;
	
	public Empresa(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial.toUpperCase(); 
	}
	
	public String getCnpj() {
		return this.cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial.toUpperCase();
	}
	
	
}
