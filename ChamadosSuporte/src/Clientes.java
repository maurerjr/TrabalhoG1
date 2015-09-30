import java.util.Scanner;

public class Clientes {
	Scanner tc = new Scanner(System.in);
	private String nome;
	private String telefone;
	private String email;
	private String login;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public boolean validaNome(String nome){
		int cont=0;
		char name[] = nome.toCharArray();
		
		for(int i =0; i< name.length; i++){
			char nome1 = name[i];
			if(nome1=='1' || nome1=='2' || nome1=='3'|| nome1=='4'|| nome1=='5'|| nome1=='6'|| nome1=='7'|| nome1=='8'|| nome1=='9'|| nome1=='0'){
			    cont++;
				if(cont!=0){
				return true;
				}
			}
		}
		return false;
		}
	
	public void mostrar(){
		System.out.println("Nome: "+getNome());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("E-mail: "+getEmail());
		System.out.println("Login: "+getLogin());
		System.out.println("Senha: "+getSenha());
	}
	
	public void ler (){		
		System.out.println("Nome: ");
		String nome=tc.next();
		System.out.println("Telefone: ");
		String telefone=tc.next();
		System.out.println("Email: ");
		String email=tc.next();
		System.out.println("Login: ");
		String login=tc.next();
		System.out.println("Senha: ");
		String senha=tc.next();
		
		setNome(nome);
		setTelefone(telefone);
		setEmail(email);
		setLogin(login);
		setSenha(senha);
	}
	

	
}