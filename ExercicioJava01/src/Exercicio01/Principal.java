package Exercicio01;

import java.util.Scanner;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario[] usuarios = new Usuario[100];
		int op = 0;
		
		usuarios[0] = new Usuario("Larysson", 52691, "Larysson_cb", "Rua 25","52912");
		usuarios[1] = new Usuario("Luiz", 5245691, "Lauiz@10", "Rua 28","545612");
		usuarios[2] = new Usuario("Luiza", 57791, "Lauiza@580", "Rua 28","47111");
		usuarios[3] = new Usuario("Laura", 5741, "Laura@5454", "Rua 48","55844");
		

		System.out.println("----------------------------------------------------------------------------------------");
		escreverMenu(op,usuarios);
		
	}

	public static void escreverMenu(int op,  Usuario[] usuarios) {
		System.out.println("Tela Menu Principal");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Menu Principal");
		System.out.println("1 - Incluir Usuário");
		System.out.println("2 - Alterar Usuário");
		System.out.println("3 - Excluir Usuário");
		System.out.println("4 - Consultar Usuário");
		System.out.println("5 - Listar Usuários");
		System.out.println("9 - Sair do Sistema");
		System.out.print("Digite a opção desejada:");
		op = teclado.nextInt();
		System.out.println("----------------------------------------------------------------------------------------");
		selecionarOpMenu(op, usuarios);
	}

	public static void selecionarOpMenu(int op, Usuario[] usuarios) {
		switch (op) {
			case 1:
				System.out.println("Tela: Incluir Usuário");
				System.out.println("----------------------------------------------------------------------------------------");
				for(int x =0;x < usuarios.length;x++){
					if(usuarios[x] == null){
						usuarios[x] = new Usuario();
						usuarios[x].cadastrarUsuario();
						System.out.println(usuarios[x]);
						break;
					}
				}		
				System.out.println("----------------------------------------------------------------------------------------");
				escreverMenu(op, usuarios);
			break;
			case 2:
				System.out.println("Tela: Alterar Usuário");
				System.out.println("----------------------------------------------------------------------------------------");
				Usuario.alterarUsuario(usuarios);
				escreverMenu(op, usuarios);
				break;
			case 3:
				 Usuario.excluiUsuario(usuarios);
				 escreverMenu(op, usuarios);
				break;
			case 4:
				Usuario.consultarDados(usuarios);
				escreverMenu(op, usuarios);
				break;
			case 5:
				int x =0;
				for(;x< usuarios.length;x++){
					if(usuarios[x] != null){
						System.out.println("----------------------------------------------------------------------------------------");
						Usuario.exibirUsuarios(usuarios[x]);
					}
				}
				escreverMenu(op, usuarios);
				break;
				default:
					System.out.println("Opção Inválida");
					escreverMenu(op, usuarios);
					System.out.println("----------------------------------------------------------------------------------------");
		}
	}
}
