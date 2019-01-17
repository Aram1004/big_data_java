package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.DB와 연결
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "hr";
		String pwd = "hr";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try { 
			//1.DB와 연결
		conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("DB와 연결완료");
		//2. Statement 생성 - SQL 문을 DB에 전송하는 메소드 제공.  --쿼리문을 날리는 문장(statement)
		stmt = conn.createStatement(); //Satement 생성
		//3.SQL문 전송 - SQL문은 String으로 설정.
		// Statement.executeQuery() --select 문을 DB에 전송할떄 씀
		//Statement.executeUpdate() --select문을 제외한 모든 sql문 전송.
		String insertSQL = "insert into dept values (51, '새부서','서울')"; //<-- 이쿼리를 sql으로 전송하겟다는 말
		
		int cnt = stmt.executeUpdate(insertSQL);
		System.out.println("삽입된 레코드 수 : "+ cnt);  //변경된 레코드의 개수 알려줌

		String selectSQL = 
				"select deptno, dname, loc from dept";
		rset = stmt.executeQuery(selectSQL);
		while(rset.next()) {
			int dno = rset.getInt("deptno");
			String dname = rset.getString("dname");
			String loc = rset.getString("loc");
			System.out.printf("%d,%s,%s%n", dno,dname, loc);
		}
		
		
		}catch(SQLException e) {
		System.out.println("오류발생");
		e.printStackTrace();
	}finally {
		//4. DB와 연결 닫기 ( 끊기 ) - finally
		try {
		rset.close();
		stmt.close();
		conn.close();
		}catch(SQLException e ) {
			e.fillInStackTrace();
		}
	}

	}
	}

//정수: getint, getlong / 문자 : getString / 실수: getdouble /날자: getDate , getTime, getTimeStamp()
