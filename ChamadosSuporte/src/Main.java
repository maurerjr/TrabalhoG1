import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		ArrayList<Clientes> cliente = new ArrayList<>();
		ArrayList<Chamados> chamado = new ArrayList<>();
		ArrayList<Tecnicos> tecnico = new ArrayList<>();
		ArrayList<Gerentes> gerente = new ArrayList<>();
		int op1; 
		int op2; 
		int op3;
		int contchamados = 0;
			
		
		do{
			System.out.println("1 - Cliente\n2 - Tecnico\n3 - Gerente\n0 - Sair");
			
			

			    	
			    	
			   
			
					
			op1 = tc.nextInt();
			switch (op1) {
			case 1:{ //               CLIENTE
				
				System.out.println("\nDigite login:");
				String login = tc.nextLine();
				System.out.println("\nDigite Senha");
				String senha = tc.nextLine();
				  for(int i=0; i< cliente.size(); i++){
				 boolean val = login.equals(cliente.get(i)) && senha.equals(cliente.get(i));{
				    	if(val == true){
				    		System.out.println("\n Login feito com sucesso");
				
				do{
					System.out.println("\n\n 1 - Cadastrar chamados\n 2 - Ver chamados\n 3 - Editar chamados\n 0 - Voltar\n");
							
					op2 = tc.nextInt();
					switch (op2) {
					case 1:{
						Chamados c = new Chamados();
						contchamados++;
						c.lerChamado(contchamados);
						chamado.add(c);
						break;
					}						
					case 2:{
						Chamados c = new Chamados();
						for (int l = 0; l < chamado.size(); l++) {
							c=chamado.get(l);
							c.mostrarChamado();
						}
						break;
					}
					
					case 3:{
						Chamados c = new Chamados();
						System.out.println("Qual chamado quer modificar: ");
						int modChamados = tc.nextInt();
						chamado.set(modChamados-1, c.modificarChamado());
						
						break;
					}	
					default:
						break;
					}
				}while(op2!=0);
				break;
			}
			
	
			
	else{
		System.out.println("Login ou senha invalida");
		break;
}
}
}
			}
			case 2:{//   TECNICO 
				
				System.out.println("\nDigite login:");
				String login = tc.nextLine();
				System.out.println("\nDigite Senha");
				String senha = tc.nextLine();
				  for(int i=0; i< cliente.size(); i++){
				 boolean val = login.equals(tecnico.get(i)) && senha.equals(tecnico.get(i));{
				    	if(val == true){
				    		System.out.println("\n Login feito com sucesso");
				do {
					
					System.out.println("\n \n 1 - Ver tarefas pendentes\n 2 - Ver tarefas realizadas\n 3 - Finalizar tarefas\n 0 - Voltar\n");
					op2=tc.nextInt();
					switch (op2) {
					case 1:{
						
					break;	
					}					
					default:
						System.out.println("OP��O INVALIDA.");
						break;
					}
				} while (op2!=0);
			break;
			}
				    	
				    	else{
				    		System.out.println("Login ou senha invalida");
				    		break;
				    }
				    }
				    }
			}
					
			case 3:{ //  GERENTE 
				
				do{
					System.out.println("\n \n 1 - Logar Gerente \n 2 - Cadastrar Gerente \n 0 - Sair");
					op3= tc.nextInt();
					switch(op3){
					
					case 1: {
					
					System.out.println("\nDigite login:");
					String login = tc.nextLine();
					System.out.println("\nDigite Senha");
					String senha = tc.nextLine();
					  for(int i=0; i< cliente.size(); i++){
					 boolean val = login.equals(tecnico.get(i)) && senha.equals(tecnico.get(i));{
					    	if(val == true){
					    		System.out.println("\n Login feito com sucesso");
				
				
				
				do{
					System.out.println("\n\n 1 - Cadastrar Cliente\n 2 - Mostrar Clientes\n 3 - Ver tarefas pendentes\n 4 - Ver tarefas realizadas\n 5 - Finalizar tarefas\n 6 - Cadastra Gerente\n 7 - Mostrar Gerentes\n 0 - Voltar\n ");
							
					op2=tc.nextInt();
					switch (op2) {
					case 1:{
						Clientes c = new Clientes();
						c.ler();
						cliente.add(c);
						break;
					}
					case 2:{
						Clientes c = new Clientes();
						for (int l = 0; l < cliente.size(); l++) {
							c=cliente.get(l);
							
							c.mostrar();
						}
					break;
					}
					case 3:{
						Chamados c = new Chamados();
						for (int l = 0; l < chamado.size(); l++) {
							c.mostrarChamado();
						}
						break;
					}
					case 6:{
						Gerentes g = new Gerentes();
						g.cadastraGerente();
						gerente.add(g);
						break;
					}
					case 7:{
						Gerentes g = new Gerentes();
						for (int l = 0; l < gerente.size(); l++) {
							g=gerente.get(l);
							g.mostraGerente();
						}
						break;	
					}
					default:
						System.out.println("OP��O INVALIDA.");
						break;
					}
					}while (op2!=0);
				break;
			}
			else
			{
				System.out.println("Login ou senha invalida");
	    		break;
	    }
	    }
	    }
			}
			
			
			
			case 0:
				
				break;
			
		
			}
		}while(op3!=0);
			}
			}
			}while(op1!=0);
	tc.close();
			}
}