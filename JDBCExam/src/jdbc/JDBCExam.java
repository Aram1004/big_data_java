package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.DB�� ����
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "hr";
		String pwd = "hr";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try { 
			//1.DB�� ����
		conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("DB�� ����Ϸ�");
		//2. Statement ���� - SQL ���� DB�� �����ϴ� �޼ҵ� ����.  --�������� ������ ����(statement)
		stmt = conn.createStatement(); //Satement ����
		//3.SQL�� ���� - SQL���� String���� ����.
		// Statement.executeQuery() --select ���� DB�� �����ҋ� ��
		//Statement.executeUpdate() --select���� ������ ��� sql�� ����.
		String insertSQL = "insert into dept values (51, '���μ�','����')"; //<-- �������� sql���� �����ϰٴٴ� ��
		
		int cnt = stmt.executeUpdate(insertSQL);
		System.out.println("���Ե� ���ڵ� �� : "+ cnt);  //����� ���ڵ��� ���� �˷���

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
		System.out.println("�����߻�");
		e.printStackTrace();
	}finally {
		//4. DB�� ���� �ݱ� ( ���� ) - finally
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

//����: getint, getlong / ���� : getString / �Ǽ�: getdouble /����: getDate , getTime, getTimeStamp()
