import java.sql.*;

public class CreateTables {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        st.execute("CREATE TABLE DEPT (Deptno INT PRIMARY KEY, Dname VARCHAR(20), Loc VARCHAR(20))");
        st.execute("CREATE TABLE EMP (Empno INT PRIMARY KEY, Ename VARCHAR(20), Job VARCHAR(20), Mgr INT, Hiredate DATE, Sal INT, Comm INT, Deptno INT)");
        st.execute("CREATE TABLE STUDENT (Sid INT PRIMARY KEY, Sname VARCHAR(14), Course VARCHAR(20))");
        st.execute("CREATE TABLE EMP_LOG (Empno INT, Logdate DATE, Newsal INT, Remark VARCHAR(50))");
        st.close();
        con.close();
    }
}
