//package com.hcl.pluginExample;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import org.junit.Test;
//
//public class SQLinjectionTest {
//
//	@Test
//	public void testSqlInjection() {
//		String input = "'; DROP TABLE users; --";
//		String query = "SELECT * FROM users WHERE username = '" + input + "'";
//		try {
//			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery(query);
//		} catch (SQLException e) {
//			//Exception handling
//		}
//	}
//}
