package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.lang.model.element.Element;

import models.Product;
import utils.db.ConnectionFactory;

public class ProductDAO {
		
	public static Product get(Integer id) {
		Connection connection = null;
		try {
			Product product = new Product();
			connection =  ConnectionFactory.getConnection();
			
			String productSQL = "SELECT * from products WHERE id = ?;";
			
			PreparedStatement statement = connection.prepareStatement(productSQL);
			statement.setInt(1, id);
			
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setShortDescription(resultSet.getString("shortDescription"));
				product.setAdditionalInformation(resultSet.getString("additionalInformation"));
				product.setId(id);
			}else {
				return null;
			}
			return product;
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
		return null;
	}
}
