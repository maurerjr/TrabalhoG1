import java.util.Scanner;

public class Tecnicos {
	Scanner tc = new Scanner(System.in);
	
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
	
	public void ler(){
		
		System.out.println("Nome: ");
		String nome=tc.next();
		System.out.println("Login: ");
		String login=tc.next();
		System.out.println("Senha: ");
		String senha=tc.next();
		
		setNome(nome);
		setLogin(login);
		setSenha(senha);
	}
	
	public void mostrar(){
		System.out.println("Nome: "+getNome());
		System.out.println("Login: "+getLogin());
		System.out.println("Senha: "+getSenha());
	}

}