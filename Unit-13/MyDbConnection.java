package mydatabace;

import java.sql.*;

public class MyDbConnection {

	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;

	public static void main(String[] args) {

		try {
			// Loading the Driver
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "root", "");

			st = con.createStatement();

			// inserting the values
			String s = "insert into userinformation(userName,age,address) VALUES('hjkjkk',24,'Bangalore')";

			int n = st.executeUpdate(s);

			System.out.println("Number of rows inserted =" + n);
			// Deleting the Data

			s = "DELETE FROM userinformation WHERE userid=11";
			n = st.executeUpdate(s);

			System.out.println("Number of rows Deleted =" + n);

			// Selecting the Data
			s = "select * from userinformation";
			rs = st.executeQuery(s);
			System.out.println("UserId \t UserName \t Age\t Address");
			while (rs.next()) {
				int uid = rs.getInt(1); // getting by index
				String uname = rs.getString("userName"); // getting by col name
				int uage = rs.getInt("age");
				String uaddr = rs.getString(4);

				System.out.print(" " + uid + "\t" + uname + "\t\t" + uage + "\t " + uaddr);
				System.out.println();

			}

		} catch (Exception e) {
			System.out.println("Error in conection");
		} finally {

			try {
				st.close();
				rs.close();
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

}
