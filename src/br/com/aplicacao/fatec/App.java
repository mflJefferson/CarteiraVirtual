package br.com.aplicacao.fatec;

import br.com.modelo.fatec.Agenda;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {

	public static void main(String[] args) throws Exception {
		Menu menu = new Menu();
		Agenda ag = new Agenda();
		Controle c = new Controle();
		try {
			ag = c.carregar();
		}
		catch(Exception e) {
			ag = new Agenda();
		}
		
		int opcao = 100;
		while(opcao != 0) {
			menu.imprimirMenu();
			Controle ctrl = new Controle();
			opcao = ctrl.opcao();
			if(opcao == 1) {
				ag.loginUsuario();
				break;
			}
			if(opcao == 2) {
				ag.cadastrarUsuario();
			}
		}
	}
}
