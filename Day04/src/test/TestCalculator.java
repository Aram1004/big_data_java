package test;


import java.util.List;
import java.util.Map;

import kr.co.domain.Calculator; //��Ű��.Ŭ���� �� �̸� ����.
//import java.util.List;
//import java.util.Map;
//import java.util.*;
//��Ŭ���� ����Ű : control+shift+o - �ڵ�����Ʈ
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
		//�ٸ� ��Ű���� Ŭ������ ��� - 1. ��Ű����.Ŭ�����̸�
		//  2. import ���� �̿�.(������ ���)
		//����: java.lang ��Ű������ Ŭ�������� �׳� ��밡��
		
		
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









