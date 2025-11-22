import java.sql.*;

public class DBSetup {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        st.execute("DROP PROCEDURE IF EXISTS get_emp_details");
        st.execute("CREATE PROCEDURE get_emp_details(IN dno INT) BEGIN SELECT e.ename, d.dname FROM EMP e JOIN DEPT d ON e.Deptno=d.Deptno WHERE e.Deptno=dno; END");
        st.execute("DROP TRIGGER IF EXISTS trg_salary_update");
        st.execute("CREATE TRIGGER trg_salary_update AFTER UPDATE ON EMP FOR EACH ROW INSERT INTO EMP_LOG VALUES (OLD.Empno, CURDATE(), NEW.Sal, 'SALARY UPDATED')");
        st.close();
        con.close();
    }
}
