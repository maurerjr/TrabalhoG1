import java.util.Scanner;

public class Chamados {
	Scanner tc = new Scanner(System.in);
	public int numChamado;
	public String descChamado;
	public int urgencia;
	public int tecnico;
	public int tecnicoCo;
	public boolean situacao;
	
	public void lerChamado(int nChamado){
		System.out.println("Descrição do problema: ");
		descChamado = tc.next();
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

	
	public String mostrarChamado(){
		
		return  "Numero do chamado: "+numChamado +"Problema: "+descChamado;
			
	}


	public Chamados modificarChamado() {
		System.out.println("Descrição do problema: ");
		descChamado = tc.next();
		System.out.println("Nivel de urgencia: ");
		urgencia = tc.nextInt();
		return this;
	}
	
	public void lerTecnico(){
		System.out.println("\n Digite numero do tecnico");
		tecnico = tc.nextInt();
		situacao = false;
	}

}