package jdbcDemo;
import java.sql.*;
/* Steps for database connectivity
 * 
 * 1. import package
 * 2. load and register drive 
 * 3. establish connection
 * 4. create statement 
 * 5. execute query
 * 6. process results
 * 7. close
 * 
 */


public class DemoClass {

	public static void main(String[] args) throws Exception
	{
		
		String url="jdbc:mysql://localhost:3306/movies";
		String uname="root";
		String pswd="SumitraAD";
		
		String query = "SELECT title FROM movies where release_year=2020";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pswd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("title");
		
		System.out.print(name);
		
		st.close();
		con.close();

	}

}
