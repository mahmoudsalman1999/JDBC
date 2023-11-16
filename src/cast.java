import java.sql.SQLException;
import java.util.List;

public interface cast {
    List <castomer> fidall () throws SQLException;
    void findbyID (int Cas_ID) throws SQLException;
    void save (castomer castomer1) throws SQLException;
    void deletbyID (int Cast_ID) throws SQLException;
}
