import java.sql.*;

public class ModifyStudent {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        st.execute("ALTER TABLE STUDENT ADD Pin BIGINT");
        st.execute("ALTER TABLE STUDENT MODIFY Sname VARCHAR(40)");
        st.close();
        con.close();
    }
}
