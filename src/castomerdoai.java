import java.sql.*;
import java.util.List;

public class castomerdoai implements cast{

    @Override
    public List<castomer> fidall() throws SQLException {
        String url ="jdbc:mysql://127.0.0.1:3306/shopp" ;
        String user = "root";
        String pass ="5826";
        String quiry  ="SELECT * FROM shopp.castomers;";
        Connection con =DriverManager.getConnection(url , user , pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(quiry);
        String name = "";
        while (rs.next())
        {
            name = rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3)
+ " : " +rs.getString(4)+ " : "+rs.getString(5) + " : " +rs.getString(6) + " : "+rs.getString(7);           ;
            System.out.println(name);
        }
        st.close();
        con.close();
        return null;
    }

    @Override
    public void findbyID(int Cas_ID) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry="Select First_Name from castomers where Cast_ID =? ;";

        Connection con =DriverManager.getConnection(url , user , pass);
        PreparedStatement st = con.prepareStatement(quiry);
        st.setInt(1,Cas_ID);
        ResultSet rs = st.executeQuery();


        rs.next();

        String name = rs.getString("First_Name") ;
        System.out.println(name);
        st.close();
        con.close();

    }

    @Override
    public void save(castomer castomer1) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry=" INSERT INTO `shopp`.`castomers` (`Cast_ID`, `First_name`, `Last_name`, `Phone`, `Email`, `City`, `Streat`) VALUES (?, ?, ?,?,?,?,?);";

        Connection con =DriverManager.getConnection(url , user , pass);
        PreparedStatement st = con.prepareStatement(quiry);
        st.setInt(1,castomer1.getCast_ID());
        st.setString(2,castomer1.getFirst_Name());
        st.setString(3,castomer1.getLast_Name());
        st.setString(4,castomer1.getPhone());
        st.setString(5,castomer1.getEmail());
        st.setString(6,castomer1.getCity());
        st.setString(7,castomer1.getStreat());
        int coun = st.executeUpdate();
        System.out.println(coun + " Done ");
        st.close();
        con.close();


    }

    @Override
    public void deletbyID(int Cast_ID) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry="DELETE from castomers where Cast_ID =? ;";
        Connection con =DriverManager.getConnection(url , user , pass);

        try {
            PreparedStatement st = con.prepareStatement(quiry);
            st.setInt(1 , Cast_ID);
            st.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                con.close();
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}


