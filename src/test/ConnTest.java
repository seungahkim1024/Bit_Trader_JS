package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import enums.Props;

public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{ //DB 안 오라클
			Class.forName(Props.ORA_DRIVER.getValue());
			conn = DriverManager.getConnection(
					Props.DB_URL.getValue(), 
					Props.DB_USER.getValue(), 
					Props.DB_PASS.getValue()); //url주소는 DB의 Oracle 프로퍼티에 있다.
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT COUNT(*) AS COUNT FROM EMPLOYEES");
			String count = "";
			
			while(rs.next()){
				count = rs.getString("COUNT"); //컬럼은 cmd에서 테이블 만들며 썼던 name, id, ssn, pass 이런것.
			} //rs에 값이 있으면 true, 없으면 false
			System.out.println("회원의 수: "+count);
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			try {
				conn.close();//커넥션을 끊어주는것.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
}
