package com.app;

public class App {
	public static void main(String[] args) {
		
		Empresa en = new Empresa("90909090","AbC Ltda.");
		en.setRazaoSocial("QwErt Ltda.");
		
		System.out.println(
				"Cnpj: " + en.getCnpj() +
				"\nRazão Social: " + en.getRazaoSocial());
	}
}
