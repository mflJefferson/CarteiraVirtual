package br.com.negocio.fatec;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Menu implements Serializable {
	public void imprimirMenu() {
		System.out.println("### Bem vindo ###");
		System.out.println("");
		System.out.println("### Menu ###");
		System.out.println("");
		System.out.println("1 - Logar");
		System.out.println("2 - Cadastrar usuário");
	}

}
