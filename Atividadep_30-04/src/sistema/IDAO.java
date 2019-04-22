package sistema;

import java.sql.SQLException;

public interface IDAO <T>{
    void insert(T u) throws SQLException;
       
}
