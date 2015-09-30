import java.util.Scanner;

public class Chamados {
	Scanner tc = new Scanner(System.in);
	public int numChamado;
	public String descChamado;
	public int urgencia;
	
	public void lerChamado(int nChamado){
		System.out.println("Descri��o do problema: ");
		descChamado = tc.nextLine();
		System.out.println("Qual o nivel de urgencia: \n 1 - Baixa\n 2 - Media\n 3 - Alta\n 4 - Moderada\n");
		
		urgencia = tc.nextInt();
		switch (urgencia) {
		case 1:{
			urgencia = 1;
			break;	
		}
		case 2:{
			urgencia = 2;
			break;	
				}
		case 3:{
			urgencia = 3;
			break;	
		}
		case 4:{
			urgencia = 4;
			break;	
		}
		default:
			System.out.println("NIVEL DE URGENCIA NAO EXISTE.");
			break;
		}
		numChamado = nChamado;
		System.out.println("Chamado aberto.");
	}

	
	public void mostrarChamado(){
			System.out.println("Numero do chamado: "+numChamado);
			System.out.println("Problema: "+descChamado);
	}


	public Chamados modificarChamado() {
		System.out.println("Descri��o do problema: ");
		descChamado = tc.nextLine();
		System.out.println("Nivel de urgencia: ");
		urgencia = tc.nextInt();
		return this;
	}
	
	
}