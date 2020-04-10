package br.com.ecommerce.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conection {
	
	private static String driver = "com.mysql.jdbc.Driver";
	private static String usuario = "root";
	private static String senha = "root";
	private static String url = "jdbc:mysql://localhost:3306/ecommercegames?useSSL=false";

	
	public static  Connection getConnection() throws SQLException{
		Connection conn = null;		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn, PreparedStatement pst, ResultSet rs){
		try {
			if(pst != null){pst.clearParameters(); pst.close();}
			if(rs != null){rs.close();}
			if(conn != null){conn.close();}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
