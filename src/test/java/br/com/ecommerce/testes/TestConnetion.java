package br.com.ecommerce.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.ecommerce.dao.Conection;

public class TestConnetion {
	public static void main(String[] args) throws SQLException {
		Connection connection = Conection.getConnection();
	    System.out.println("Conexão aberta!");
	    connection.close();
	}
}
