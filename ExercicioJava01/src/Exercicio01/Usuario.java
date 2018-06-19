package Exercicio01;

import java.util.Formatter;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private int codigo;
	private String login;
	private String endereco;
	private String senha;

	static Scanner teclado = new Scanner(System.in);

	public Usuario(){}
	
	public Usuario(String nome, int codigo,String login,String endereco,String senha){
		this.nome = nome;
		this.codigo = codigo;
		this.login = login;
		this.endereco = endereco;
		this.senha = senha;
	}
	
	
	@Override
	public String toString() {
		String s = "Nome: " + nome;
		s += "\nCódigo: " + codigo;
		s += "\nLogin: " + login;
		s += "\nSenha: " + senha;

		return s;
	}

	public void cadastrarUsuario() {
		System.out.println("Informe o Nome do Usuário");
		nome = teclado.next();
		System.out.println("Informe o Codigo do Usuário");
		codigo = Integer.parseInt(teclado.next());
		System.out.println("Informe o Endereço do Usuário");
		endereco = teclado.next();
		teclado = new Scanner(System.in);
		System.out.println("Informe o Login do Usuário");
		login = teclado.next();
		System.out.println("Informe a Senha do Usuário");
		senha = teclado.next();
		System.out.println("----------------------------------------------------------------------------------------");

	}

	public static void alterarUsuario(Usuario[] usuarios) {
		System.out.println("Digite o código do Usuario");
		int cod = teclado.nextInt();
		System.out.println("----------------------------------------------------------------------------------------");
		for (int x = 0; x < usuarios.length; x++) {
			if (usuarios[x] != null) {
				if (usuarios[x].codigo == cod) {
					System.out.println(usuarios[x]);
					System.out.println("----------------------------------------------------------------------------------------");

					System.out.println("Alterando Dados");
					System.out.println("----------------------------------------------------------------------------------------");

					Usuario usuario2 = new Usuario();
					usuario2.cadastrarUsuario();
					System.out.println(usuario2);
					System.out.println("----------------------------------------------------------------------------------------");

					System.out.println("Mensagem: 1) Voltar, 2) Confirmar");
					if (Integer.parseInt(teclado.next()) == 2) {
						usuarios[x] = usuario2;
						System.out.println("----------------------------------------------------------------------------------------");

						System.out.println("Usuário Alterado");
						System.out.println("----------------------------------------------------------------------------------------");

						System.out.println(usuarios[x]);
						System.out.println("----------------------------------------------------------------------------------------");

						break;
					} else {
						System.out.println("Operação cancelada");
					}

				}
			}
			if (x == usuarios.length - 1) {
				System.out.println("Usuário não cadastrado");
				System.out.println("----------------------------------------------------------------------------------------");
			}
		}
	}

	public static void excluiUsuario(Usuario[] usuarios) {
		System.out.println("Digite o código do Usuario");
		int cod = teclado.nextInt();
		System.out.println("----------------------------------------------------------------------------------------");
		for (int x = 0; x < usuarios.length; x++) {
			if (usuarios[x] != null) {
				if (usuarios[x].codigo == cod) {
					System.out.println("Deseja Excluir Usuario?");
					System.out.println("----------------------------------------------------------------------------------------");
					System.out.println(usuarios[x]);
					System.out.println("----------------------------------------------------------------------------------------");
					System.out.println("Mensagem: 1) Voltar, 2) Confirmar");
					if (Integer.parseInt(teclado.next()) == 2){
						System.out.println("----------------------------------------------------------------------------------------");
						System.out.println("Usuário Excluido");
						System.out.println("----------------------------------------------------------------------------------------");
						usuarios[x] = null;
						break;
					} else {
						System.out.println("Operação cancelada");
					}
				}
			}
			if (x == usuarios.length - 1) {
				System.out.println("Usuário não cadastrado");
				System.out.println("----------------------------------------------------------------------------------------");
			}

		}

	}
	public static void consultarDados(Usuario[] usuarios){
		System.out.println("Digite o código do Usuario");
		int cod = teclado.nextInt();
		System.out.println("----------------------------------------------------------------------------------------");
		for (int x = 0; x < usuarios.length; x++) {
			if (usuarios[x] != null) {
				if (usuarios[x].codigo == cod) {
					System.out.println("Tela Consultar Usuario");
					System.out.println("----------------------------------------------------------------------------------------");
					System.out.println(usuarios[x]);
					System.out.println("----------------------------------------------------------------------------------------");
					break;
				}
			}
			if (x == usuarios.length - 1) {
				System.out.println("Usuário não cadastrado");
				System.out.println("----------------------------------------------------------------------------------------");
			}

		}
			
				
	}
	public static void  exibirUsuarios(Usuario usuario){
				
		
	System.out.println(new Formatter().format("|%d|%d|%f|%f|%s|%s|%tc|", usuario)); 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
