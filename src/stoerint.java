import java.sql.SQLException;
import java.util.List;

public interface stoerint {
    List<store> fidall () throws SQLException;
    void findbyID (int Store_ID) throws SQLException;
    void save (store store1) throws SQLException;
    void deletbyID (int Store_ID) throws SQLException;
}
