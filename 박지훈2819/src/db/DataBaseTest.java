package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * java <=> database(db)->mySql(mysqlconnectionJ), mariadb, mssql, 오라클
 * JDBC
 * 
 * 소스코드 다운로드 받기
 */


public class DataBaseTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("org.gjt.mm.mysql.Driver");
		Connection con = null;
		Statement stnt = null;
		ResultSet rs = null;
		
		String id = null,
				pwd=null,
				name=null,
				phnb=null;
		
		try {
			con=DriverManager.getConnection(
					"JDBC:mysql://127.0.0.1:3306/swing","root","toor");
			stnt=con.createStatement();
			rs=stnt.executeQuery("select user_id,user_pwd,user_name,user_phnb from user_mst");
			System.out.println("<user정보>");
			
			while(rs.next()) {
				id=rs.getString("user_id");
				pwd=rs.getString("user_pwd");
				name=rs.getString("user_name");
				phnb=rs.getString("user_phnb");
				
				System.out.println("id : "+id);
				System.out.println("pwd : "+pwd);
				System.out.println("name : "+name);
				System.out.println("phone number : "+phnb);
				System.out.println();
			}
		
		}catch(SQLException sqlEx) {
			System.out.println(sqlEx);
		}catch(Exception ex) {
			System.out.println(ex);
		}finally {
			if(rs != null) {
				try {
					rs.close();
				}catch(SQLException e) {
					System.out.println(e);
				}
			}
			if(stnt != null) {
				try {
					stnt.close();
				}catch(SQLException e) {
					System.out.println(e);
				}
			}
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					System.out.println(e);
				}
			}
		}

	}

}
