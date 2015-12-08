import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Disciplinas {
	
	
	
	
	Scanner tc = new Scanner(System.in);
	
	private String nome;
	private String professor;
	private int sala;
	private int id;
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the professor
	 */
	public String getProfessor() {
		return professor;
	}
	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	/**
	 * @return the sala
	 */
	public int getSala() {
		return sala;
	}
	/**
	 * @param sala the sala to set
	 */
	public void setSala(int sala) {
		this.sala = sala;
	}
	
	
	public void ler(){
		System.out.println("Digite o nome da Disciplina:");
		String nome =tc.next();
		System.out.println("Digite o nome do professor:");
		String professor = tc.next();
		System.out.println("Digite o numero da sala:");
		int sala = tc.nextInt();
		
		
		setNome(nome);
		setProfessor(professor);
		setSala(sala);
		
		
	}
	
	
	
	public boolean salvar(){
		Mysql m = new Mysql();
		
	
	 try {		
			String sql = "INSERT INTO disciplinas (nome, professor, sala)VALUES(?,?,?);";
			PreparedStatement comandoSQl = (PreparedStatement) m.conexao.prepareStatement(sql);
			comandoSQl.setString(1, this.nome);
			comandoSQl.setString(2, this.professor);
			comandoSQl.setInt(3, this.sala);
			

			
			comandoSQl.execute();
			
			
			comandoSQl.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m.msg =e.getMessage();
			return false;
		}	

	 
 }
	
public boolean mostrar(){
	Mysql m = new Mysql();
	String sql ="SELECT * FROM disciplinas";
	try {
		 
		 PreparedStatement comandoSql= m.conexao.prepareStatement(sql);
		 ResultSet rs =comandoSql.executeQuery();
		 while (rs.next()) {
			 int id = rs.getInt("idDisciplina");
			 String nome = rs.getString("nome");
			 String professor = rs.getString("professor");
			 int sala = rs.getInt("sala");
			
			 System.out.println("id: "+id+" nome: "+nome+" professor: "+professor+" sala: "+sala);
			 
		
			 
			 
		 }
	} catch (SQLException e) {
		// TODO: handle exception
		m.msg = e.getMessage();
		return false;
	}
	 return false;
}


public boolean mostrarTudo(){
	Mysql m = new Mysql();
	String sql ="SELECT * FROM disciplinas";
	try {
		 
		 PreparedStatement comandoSql= m.conexao.prepareStatement(sql);
		 ResultSet rs =comandoSql.executeQuery();
		 while (rs.next()) {
			 int id = rs.getInt("idDisciplina");
			 String nome = rs.getString("nome");
			 String professor = rs.getString("professor");
			 int sala = rs.getInt("sala");
			
			 System.out.println("\n id: "+id+" nome: "+nome+" professor: "+professor+" sala: "+sala);
			 Tarefas t = new Tarefas();
			 t.mostrarTudo(id);
			 
		
			 
			 
		 }
	} catch (SQLException e) {
		// TODO: handle exception
		m.msg = e.getMessage();
		return false;
	}
	 return false;
}


public boolean atualizar(int id){
	
	
	Mysql m = new Mysql();
		
	
	
	 try {		
			String sql = "UPDATE disciplinas SET nome = ?, professor=?, sala=?";
			PreparedStatement comandoSQl = (PreparedStatement) m.conexao.prepareStatement(sql);
			comandoSQl.setString(1, this.nome);
			comandoSQl.setString(2, this.professor);
			comandoSQl.setInt(3, this.sala);
			


			
			comandoSQl.execute();
			
			
			comandoSQl.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m.msg =e.getMessage();
			return false;
		}	

	 
	
	
}

public boolean remover(int id){
	
	
	Mysql m = new Mysql();
		
	
	
	 try {		
			String sql = "DELETE FROM disciplinas WHERE idDisciplina = ?";
			PreparedStatement comandoSQl = (PreparedStatement) m.conexao.prepareStatement(sql);
			comandoSQl.setInt(1, id);

			
			comandoSQl.execute();
			
			
			comandoSQl.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m.msg =e.getMessage();
			return false;
		}	
}
			 

	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Disciplinas [nome=" + nome + ", professor=" + professor + ", sala=" + sala + "]";
	}
	
	


}

