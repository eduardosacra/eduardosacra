package br.com.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.jdbc.modelo.Contato;
import br.com.jdbc.ConnectionFactory;



public class ContatoDao {
	//conexao com o banco
	private Connection conexao;
	public ContatoDao() {
		this.conexao = new ConnectionFactory().getConnection(); 
		System.out.println("Conectado com sucesso");
	}
	
	public void adiciona(Contato contato) {
		String sql ="insert into contatos (nome,email,endereco,datanascimento) values(?,?,?,?)";
		
		//prepared steatement para insercao
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			//seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNacsimento().getTimeInMillis()));
			
			//execulta
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("erro durante a gravaçao\n"+e);
		}
				

	}
}
