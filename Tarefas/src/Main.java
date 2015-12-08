import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		Scanner tc= new Scanner(System.in);
		do{
			System.out.println("\n 1- Adicionar disciplina");
			System.out.println("\n 2- Adicionar tarefa");
		
			System.out.println("\n 3- Consulta");
			System.out.println("\n 4- Atualizar disciplina por id");
			System.out.println("\n 5- Atualizar tarefa por id");
			System.out.println("\n 6- remover disciplinas e suas tarefas");
			System.out.println("\n 7- remover tarefas");
			System.out.println("\n 8- Sair");


			
			op = tc.nextInt();
			switch (op) {
			case 1:
			{
				Disciplinas d = new Disciplinas();
				d.ler();
				d.salvar();
				
				break;
			}
			
			case 2:
			{
				Disciplinas d = new Disciplinas();
				Tarefas t = new Tarefas();
				d.mostrar();
				System.out.println("\n Digite o id da disciplina que deseja adicionar a tarefa");
				int id = tc.nextInt();
				t.ler();
				t.salvar(id);
				
			}
			
			case 3:
			{
				int op2=0;
				do{
				System.out.println("\n 1- Mostrar disciplinas e suas tarefas");
				System.out.println("\n 1- Mostrar tarefa por Ordem de data a fim");
				System.out.println("\n 2- Mostrar tarefaS atrasadas");
				System.out.println("\n 3- Mostrar tarefas ordenadas pela maior urgencia");
				System.out.println("\n 4- Mostrar todas");
				op2=tc.nextInt();
				switch(op2){
				
				case 1:{
					
					Disciplinas d = new Disciplinas();
					d.mostrarTudo();
					
				}
				case 2:{
					
					Tarefas p = new Tarefas();
					p.mostrar(1);
					break;
				}
				
				case 3:{
					Tarefas p = new Tarefas();
					p.mostrar(2);
					break;
				}
					
				case 4:{
						
					Tarefas p = new Tarefas();
					p.mostrar(2);
					break;
					}
				case 5:{
					
					Tarefas p = new Tarefas();
					p.mostrar(4);
					
					break;
					}
				case 6:{
					System.out.println("Voltando....");
					break;
				    }
				
				}
			}while(op!=6);
				break;
			}
			
			
			case 4:
			{
				Disciplinas d = new Disciplinas();
				d.mostrar();
				System.out.println("Digite o id da disciplina que deseja atualizar");
				int id = tc.nextInt();
				d.ler();
				d.atualizar(id);
				
			}
			
			case 5:
			{
				Tarefas p = new Tarefas();
				System.out.println("Digite o id da tarefa que deseja atualizar: ");
				int id = tc.nextInt();
				p.ler();
				p.atualizar(id);
				break;
			
			}
			
			case 6:
			{
				Disciplinas d = new Disciplinas();
				d.mostrar();
				System.out.println("Digite o id da disciplina que deseja remover:");
				int id = tc.nextInt();
				d.remover(id);
				break;
				
			}
			
			case 7:
			{
				Tarefas p = new Tarefas();
				p.mostrar(4);
				System.out.println("Digite o id da Tarefa que deseja remover:");
				int id= tc.nextInt();
				p.remover(id);
				break;
				
			}
			
			case 8: 
			{
				System.out.println("Volte sempre!!");
				break;
			}
			
			}
			
		}while(op!=7);

	}

}
