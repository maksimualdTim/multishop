package utils.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private final static String LOGIN = "myuser";
	private final static String PASSWORD = "mypass";
	private final static String DB_URL = "jdbc:mysql://localhost:3306/multishop";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(DB_URL, LOGIN, PASSWORD);

	}
}
