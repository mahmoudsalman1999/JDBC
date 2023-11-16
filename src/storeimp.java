import java.sql.*;
import java.util.List;

public class storeimp implements stoerint{
    @Override
    public List<store> fidall() throws SQLException {
        String url ="jdbc:mysql://127.0.0.1:3306/shopp" ;
        String user = "root";
        String pass ="5826";
        String quiry  ="SELECT * FROM shopp.store;";
        Connection con = DriverManager.getConnection(url , user , pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(quiry);
        String name = "";
        while (rs.next())
        {
            name = rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3)
                    + " : " +rs.getString(4)+ " : "+rs.getString(5) + " : " +rs.getString(6) ;           ;
            System.out.println(name);
        }
        st.close();
        con.close();
        return null;
    }

    @Override
    public void findbyID(int Store_ID) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry="Select Store_Name from store where Store_ID =? ;";

        Connection con =DriverManager.getConnection(url , user , pass);
        PreparedStatement st = con.prepareStatement(quiry);
        st.setInt(1,Store_ID);
        ResultSet rs = st.executeQuery();


        rs.next();

        String name = rs.getString("Store_Name") ;
        System.out.println(name);
        st.close();
        con.close();

    }

    @Override
    public void save(store store1) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry=" INSERT INTO `shopp`.`store` (`Store_ID`, `Store_Name`, `Phone`, `Email`, `City`, `Streat`) VALUES (?, ?, ?,?,?,?);";

        Connection con =DriverManager.getConnection(url , user , pass);
        PreparedStatement st = con.prepareStatement(quiry);
        st.setInt(1,store1.getStore_ID());
        st.setString(2,store1.getStore_name());
        st.setString(3,store1.getPhone());
        st.setString(4,store1.getEmail());
        st.setString(5,store1.getCity());
        st.setString(6,store1.getStrea());

        int coun = st.executeUpdate();
        System.out.println(coun + " Done ");
        st.close();
        con.close();

    }

    @Override
    public void deletbyID(int Store_ID) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry="DELETE from store where Store_ID =? ;";
        Connection con =DriverManager.getConnection(url , user , pass);

        try {
            PreparedStatement st = con.prepareStatement(quiry);
            st.setInt(1 , Store_ID);
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


