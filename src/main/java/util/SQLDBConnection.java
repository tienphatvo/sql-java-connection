package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLDBConnection {
	private static final DBPropertiesUtil DBUTIL = DBPropertiesUtil.getInstance();

	public SQLDBConnection() {
		// Load instances
	}

	protected static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBUTIL.getProperty("driverClassName"));
			String dbURL = DBUTIL.getProperty("url");
			String dbUser = DBUTIL.getProperty("username");
			String dbPass = DBUTIL.getProperty("password");
			conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!" + ex);
		}
		return conn;
	}
}
