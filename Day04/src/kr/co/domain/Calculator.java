package kr.co.domain;
//    /kr/co/domain/Calculator.class
//  Calculator클래스의 fully name: kr.co.domain.Calculator
// 
public class Calculator {
	int num1;
	int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
	public int minus() {
		return num1 - num2;
	}
	public int multiply() {
		return num1 * num2;
	}
	public int divide() {
		return num1 / num2;
	}
}




