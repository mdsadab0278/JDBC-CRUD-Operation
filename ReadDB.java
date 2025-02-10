import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ReadDB {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/shadab";
        String username="root";
        String password="123456789";
        String query="select * from oldtable";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                int a=rs.getInt("id");
                String b=rs.getString("name");
                String c=rs.getString("address");
                String d=rs.getString("dept");
                
                System.out.println(a+" "+b+" "+c+" "+d);
            }
            
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
