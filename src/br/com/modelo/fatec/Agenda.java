package br.com.modelo.fatec;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

@SuppressWarnings("serial")
public class Agenda implements Serializable {
	protected ArrayList<Cliente> clientes;
	protected Entrada e;
	protected Cliente c;
	protected Menu menu;
	protected Cliente clienteLogado;
	
	public Agenda() {
		clientes = new ArrayList<Cliente>();
		e = new Entrada();
		menu = new Menu();
	}
	public void loginUsuario() throws Exception {
		Controle controle = new Controle();
		System.out.println("### Login ###");
		System.out.println("User: ");
		String user = controle.textoEspaco();
		for (Cliente cliente : clientes) {
			if (cliente.getUser().equals(user)) {
				System.out.println("Senha: ");
				String password = controle.textoEspaco();
				if (cliente.getPassword().equals(password)) {
					System.out.println("Login feito com sucesso");
					clienteLogado = cliente;
				} 
				else {
					System.out.println("Senha incorreta: ");
					System.exit(0);
				}
			}
			else {
				System.out.println("Usuário inexistente, certifique-se de que se cadastrou "
						+ "e escreveu seu usuário corretamente");
				System.exit(0);
			}
		}
	}
	
	public Cliente cadastrarUsuario() {
		Controle controle = new Controle();				
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o nome do cliente: ");
		String nome = controle.texto();
		
		System.out.println("Digite o telefone do cliente: ");
		String telefone = controle.texto();
		
		System.out.println("Digite o email do cliente: ");
		String email = controle.texto();
		
		System.out.println("Digite o nome de usuário do cliente: ");
		String user = controle.texto();
		
		System.out.println("Digite a senha de sua conta: ");
		String password = controle.texto();
		
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		cliente.setUser(user);
		cliente.setPassword(password);
		clientes.add(cliente);
		System.out.println("Cadastro concluido");
		return cliente;
		}
	

}
