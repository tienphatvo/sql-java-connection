package func;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import annotation.SQLEncryptedColumn;
import model.Client;
import util.FieldUtil;
import util.SQLDBConnection;

public class GetData extends SQLDBConnection {

	private static Connection conn = getConnection();

	public static void main(String[] args) {
		List<Client> clients = getAllClientInfo();
		clients.stream().filter(Objects::nonNull).forEach(System.out::println);

		List<Field> fields = FieldUtil.getFields(Client.class);
		for (Field f : fields) {
			if(f.isAnnotationPresent(SQLEncryptedColumn.class)) {
				System.out.println(f.getName());
				SQLEncryptedColumn sqlEncryptedColumn = f.getAnnotation(SQLEncryptedColumn.class);
				System.out.println(sqlEncryptedColumn.datatype());
			}

		}
	}

	private static List<Client> getAllClientInfo() {
		List<Client> clients = new ArrayList<Client>();
		Client client = null;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Client");
			while (rs.next()) {
				client = new Client();
				client.setClientID(rs.getInt("ClientID"));
				client.setLastName(rs.getString("LastName"));
				client.setFirstName(rs.getString("FirstName"));
				client.setPhone(rs.getString("Phone"));
				client.setDob(rs.getString("Dob"));
				client.setAddress(rs.getString("Address"));
				client.setCity(rs.getString("City"));
				clients.add(client);
			}
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return clients;
	}

	private static void updateClientLastname(Client client) {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("update client set LastName = ? where ClientID = ?");
			ps.setString(1, client.getLastName());
			ps.setInt(2, client.getClientID());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
