package lab63;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSQLiteDB {
    public static void connect() {
        // 指向資料庫路徑
        String url = "jdbc:sqlite:C:\\Users\\student\\Documents\\demo.db";
        // 查看 lotto 資料表資料
        String sql = "Select id, number, datetime from lotto";
        // 資料庫連線
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement(); // 建立敘述物件
            ResultSet rs = stmt.executeQuery(sql)) { // 查詢資料
            System.out.println("資料庫連線成功");
            
            while (rs.next()) {
                System.out.printf("%d\t%d\t%s%n", rs.getInt("id"), rs.getInt("number"), rs.getString("datetime"));
            }
            
            
        } catch (SQLException e) {
            System.out.println("資料庫連線失敗");
            e.printStackTrace(); // 印出失敗原因
        }
    }
   
    public static void main(String[] args) {
        connect();
    }
}
