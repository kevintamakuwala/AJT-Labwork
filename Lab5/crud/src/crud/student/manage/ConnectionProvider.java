package crud.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con;

	public static Connection CreateConnection() {

		try {
//			Loading The driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
