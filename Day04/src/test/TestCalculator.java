package test;


import java.util.List;
import java.util.Map;

import kr.co.domain.Calculator; //패키지.클래스 를 미리 선언.
//import java.util.List;
//import java.util.Map;
//import java.util.*;
//이클립스 단축키 : control+shift+o - 자동임포트
public class TestCalculator {

	Calculator c = new Calculator(5, 10);
	
	public void a() {
		c.plus();
	}
	public void b() {
		c.plus();
		c.minus();
	}
	public void c() {
		c.divide();
	}
	public void d() {
		c.multiply();
		c.plus();
	}
	
	
	public static void main(String[] args) {
		//다른 패키지의 클래스를 사용 - 1. 패키지명.클래스이름
		//  2. import 구문 이용.(간편한 방법)
		//예외: java.lang 패키지내의 클래스들은 그냥 사용가능
		
		
//		kr.co.domain.Calculator c = 
//				new kr.co.domain.Calculator(10, 20);
		Calculator c = new Calculator(10, 20);
		System.out.println(c.plus());
		String str = "abc";
		List list = null;
		Map map = null;
		java.awt.List l;
	}
}









