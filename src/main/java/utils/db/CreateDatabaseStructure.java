package utils.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabaseStructure {
	public static void createProductTable() {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			
			Statement statement = connection.createStatement();
			
			String tableSql = "CREATE TABLE IF NOT EXISTS products" + 
			"(id int PRIMARY KEY AUTO_INCREMENT, name varchar(255), shortDescription TEXT, description TEXT," + 
			"price INT, salesPrice INT, additionalInformation TEXT);";
			
			statement.execute(tableSql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void seedProduct() {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			
			Statement statement = connection.createStatement();
			
			String tableSql = "INSERT INTO products (name, shortDescription, description, additionalInformation, price, salesPrice)" + 
			" VALUES ('Boots', 'Volup erat ipsum diam elitr rebum et dolor. Est nonumy elitr erat diam stet sit clita ea. Sanc ipsum et, labore clita lorem magna duo dolor no sea Nonumy'," +
			"'Eos no lorem eirmod diam diam, eos elitr et gubergren diam sea. Consetetur vero aliquyam invidunt duo dolores et duo sit. Vero diam ea vero et dolore rebum, dolor rebum eirmod consetetur invidunt sed sed et, lorem duo et eos elitr, sadipscing kasd ipsum rebum diam. Dolore diam stet rebum sed tempor kasd eirmod. Takimata kasd ipsum accusam sadipscing, eos dolores sit no ut diam consetetur duo justo est, sit sanctus diam tempor aliquyam eirmod nonumy rebum dolor accusam, ipsum kasd eos consetetur at sit rebum, diam kasd invidunt tempor lorem, ipsum lorem elitr sanctus eirmod takimata dolor ea invidunt.\n"
			+ "\n"
			+ "Dolore magna est eirmod sanctus dolor, amet diam et eirmod et ipsum. Amet dolore tempor consetetur sed lorem dolor sit lorem tempor. Gubergren amet amet labore sadipscing clita clita diam clita. Sea amet et sed ipsum lorem elitr et, amet et labore voluptua sit rebum. Ea erat sed et diam takimata sed justo. Magna takimata justo et amet magna et.'," + 
			"'Eos no lorem eirmod diam diam, eos elitr et gubergren diam sea. Consetetur vero aliquyam invidunt duo dolores et duo sit. Vero diam ea vero et dolore rebum, dolor rebum eirmod consetetur invidunt sed sed et, lorem duo et eos elitr, sadipscing kasd ipsum rebum diam. Dolore diam stet rebum sed tempor kasd eirmod. Takimata kasd ipsum accusam sadipscing, eos dolores sit no ut diam consetetur duo justo est, sit sanctus diam tempor aliquyam eirmod nonumy rebum dolor accusam, ipsum kasd eos consetetur at sit rebum, diam kasd invidunt tempor lorem, ipsum lorem elitr sanctus eirmod takimata dolor ea invidunt.'," + 
			"15000, null);";
			
			statement.execute(tableSql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void cleanProductTable() {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			
			Statement statement = connection.createStatement();
			
			statement.execute("DROP TABLE IF EXISTS products;");
			
			createProductTable();
			seedProduct();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		CreateDatabaseStructure.cleanProductTable();
	}
}
