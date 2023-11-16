import java.sql.*;
import java.util.List;

public class ordersimp implements ordersint {
    @Override
    public List<orders> findall() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry = "SELECT * FROM shopp.orders;";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(quiry);
        String name = "";
        while (rs.next()) {
            name = rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3)
                    + " : " + rs.getString(4) + " : " + rs.getString(5);
            ;
            System.out.println(name);
        }
        st.close();
        con.close();
        return null;
    }

    public void FindbyID(int Order_ID) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry = "Select Order_state from store where Store_ID =? ;";

        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement st = con.prepareStatement(quiry);
        st.setInt(1, Order_ID);
        ResultSet rs = st.executeQuery();


        rs.next();

        String name = rs.getString(" Order_state");
        System.out.println(name);
        st.close();
        con.close();
    }


    @Override
    public void save(orders orders1) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry = " INSERT INTO `shopp`.`orders` (`Order_ID`, `Order_State`,  `Cast_ID`, )  VALUES ( ?,?,?);";

        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement st = con.prepareStatement(quiry);
        st.setInt(1, orders1.getOrder_ID());
        st.setString(2, orders1.getOrder_state());
        st.setInt(3, orders1.getCast_ID());


        int coun = st.executeUpdate();
        System.out.println(coun + " Done ");
        st.close();
        con.close();

    }


    @Override
    public void deletebyID(int Order_ID) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopp";
        String user = "root";
        String pass = "5826";
        String quiry = "DELETE from orders where Order_ID =? ;";
        Connection con = DriverManager.getConnection(url, user, pass);

        try {
            PreparedStatement st = con.prepareStatement(quiry);
            st.setInt(1, Order_ID);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



