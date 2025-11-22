import java.sql.*;

public class CallProc {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        CallableStatement cs = con.prepareCall("{call get_emp_details(?)}");
        cs.setInt(1, 20);
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }
        cs.close();
        con.close();
    }
}
