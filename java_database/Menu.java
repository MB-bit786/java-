import java.sql.*;
import java.util.*;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        int ch = sc.nextInt();
        ResultSet rs;
        switch (ch) {
            case 1: rs = st.executeQuery("SELECT DISTINCT Job FROM EMP"); break;
            case 2: rs = st.executeQuery("SELECT * FROM EMP ORDER BY Deptno ASC, Job DESC"); break;
            case 3: rs = st.executeQuery("SELECT DISTINCT Job FROM EMP ORDER BY Job DESC"); break;
            case 4: rs = st.executeQuery("SELECT * FROM EMP WHERE YEAR(Hiredate)<1981"); break;
            case 5: rs = st.executeQuery("SELECT Empno,Ename,Sal,(Sal/30) AS Daily FROM EMP ORDER BY (Sal*12) ASC"); break;
            case 6: rs = st.executeQuery("SELECT Empno,Ename,Sal,(YEAR(CURDATE())-YEAR(Hiredate)) AS Exp FROM EMP WHERE Mgr=7369"); break;
            case 7: rs = st.executeQuery("SELECT * FROM EMP WHERE Comm > Sal"); break;
            case 8: rs = st.executeQuery("SELECT * FROM EMP WHERE Job IN('CLERK','ANALYST') ORDER BY Job DESC"); break;
            case 9: rs = st.executeQuery("SELECT * FROM EMP WHERE Sal*12 BETWEEN 22000 AND 45000"); break;
            case 10: rs = st.executeQuery("SELECT * FROM EMP WHERE Ename LIKE 'S____'"); break;
            case 11: rs = st.executeQuery("SELECT * FROM EMP WHERE Empno NOT LIKE '78%'"); break;
            case 12: rs = st.executeQuery("SELECT * FROM EMP WHERE Job='CLERK' AND Deptno=20"); break;
            case 13: rs = st.executeQuery("SELECT e.* FROM EMP e JOIN EMP m ON e.Mgr=m.Empno WHERE e.Hiredate < m.Hiredate"); break;
            case 14: rs = st.executeQuery("SELECT * FROM EMP WHERE Deptno=20 AND Job IN(SELECT Job FROM EMP WHERE Deptno=10)"); break;
            case 15: rs = st.executeQuery("SELECT * FROM EMP WHERE Sal IN(SELECT Sal FROM EMP WHERE Ename IN('FORD','SMITH')) ORDER BY Sal DESC"); break;
            case 16: rs = st.executeQuery("SELECT * FROM EMP WHERE Job IN(SELECT Job FROM EMP WHERE Ename IN('SMITH','ALLEN'))"); break;
            case 17: rs = st.executeQuery("SELECT DISTINCT Job FROM EMP WHERE Deptno=10 AND Job NOT IN(SELECT Job FROM EMP WHERE Deptno=20)"); break;
            case 18: rs = st.executeQuery("SELECT MAX(Sal) FROM EMP"); break;
            case 19: rs = st.executeQuery("SELECT * FROM EMP WHERE Sal=(SELECT MAX(Sal) FROM EMP)"); break;
            case 20: rs = st.executeQuery("SELECT SUM(Sal) FROM EMP WHERE Job='MANAGER'"); break;
            case 21: rs = st.executeQuery("SELECT * FROM EMP WHERE Ename LIKE '%A%'"); break;
            case 22: rs = st.executeQuery("SELECT Job,MIN(Sal) FROM EMP GROUP BY Job ORDER BY MIN(Sal) ASC"); break;
            case 23: rs = st.executeQuery("SELECT * FROM EMP WHERE Sal > (SELECT Sal FROM EMP WHERE Ename='BLAKE')"); break;
            case 24: rs = st.executeQuery("SELECT * FROM v1"); break;
            case 25:
                CallableStatement cs = con.prepareCall("{call get_emp_details(?)}");
                cs.setInt(1, 20);
                rs = cs.executeQuery();
                break;
            default: return;
        }
        while (rs.next()) System.out.println(rs.getString(1));
        con.close();
    }
}
