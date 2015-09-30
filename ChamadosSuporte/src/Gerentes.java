import java.util.Scanner;

public class Gerentes {
	Scanner tc = new Scanner(System.in);	
	Clientes c = new Clientes();
	Tecnicos t = new Tecnicos();
	Chamados ch = new Chamados();
	private String nome;
	private String login;
	private String senha;
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public void cadastraGerente(){
		String nome;
		String login;
		String senha;
		
		System.out.println("Digite o nome do Gerente: ");
		nome = tc.nextLine();
		System.out.println("Digite o login: ");
		login = tc.nextLine();
		System.out.println("Digite a senha: ");
		senha = tc.nextLine();
		
		setNome(nome);
		setLogin(login);
		setSenha(senha);
	}
	
	public void mostraGerente(){
		System.out.println("Nome: "+getNome());
		System.out.println("Login: "+getLogin());
		System.out.println("Senha: "+getSenha());
	}



}