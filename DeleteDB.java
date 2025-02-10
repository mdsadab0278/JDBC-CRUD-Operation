import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
public class DeleteDB {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/shadab";
        String username="root";
        String password="123456789";
        String query="delete from oldtable where id=15";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, username, password);
            Statement st=con.createStatement();
            st.executeUpdate(query);
            System.out.println("Successfully Connection");
            con.close();

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
