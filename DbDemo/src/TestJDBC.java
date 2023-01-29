
import java.sql.*;

public class TestJDBC {



	     public static void main(String[] args) throws Exception {
	         String url = "jdbc:mysql://localhost:3306/sys";
	         String userName = "root";
	         String password = "juliahachem";
	         String query = "select * from personne;";

	         Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection cx = DriverManager.getConnection(url,userName,password);
	         Statement st = cx.createStatement();
	         ResultSet rs = st.executeQuery(query);
	         while (rs.next()) {
	             String nom = rs.getString("Nom");
	             String p = rs.getString("Prenom");
	         
	             System.out.println("Nom : " + nom + ", prenom: " +p );
	         }
	         rs.close();
	         st.close();
	         cx.close();

	     }
	 }