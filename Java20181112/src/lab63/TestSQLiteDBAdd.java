package lab63;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class TestSQLiteDBAdd {
    private Connection connect() {
        String url = "jdbc:sqlite:C:\\Users\\student\\Documents\\demo.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void insert(int number) {
        String sql = "INSERT INTO lotto(number) VALUES(?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, number);
            pstmt.executeUpdate();
            System.out.println(number + " 新增成功");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
   
    public static void main(String[] args) throws Exception{
        TestSQLiteDBAdd db = new TestSQLiteDBAdd();
        Connection conn = db.connect();
        
        db.insert(new Random().nextInt(100));
        
        conn.close();
    }
}
