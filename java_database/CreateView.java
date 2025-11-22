import java.sql.*;

public class CreateView {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        st.execute("CREATE OR REPLACE VIEW v1 AS SELECT e.ename, e.job, d.dname, d.loc FROM EMP e JOIN DEPT d ON e.Deptno=d.Deptno");
        st.close();
        con.close();
    }
}
