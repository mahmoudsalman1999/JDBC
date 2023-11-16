import java.sql.SQLException;
import java.util.List;

public interface ordersint {
    List <orders> findall () throws SQLException;
    void FindbyID (int Order_ID) throws SQLException;
    void save (orders orders1) throws SQLException;
    void deletebyID (int Order_ID ) throws SQLException;
}
