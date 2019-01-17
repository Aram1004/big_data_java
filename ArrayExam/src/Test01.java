public class Test01{

// 메소드 구문 :[제한자] 리턴타입 이름([매개변수선언..]) {}

 /*

 1. 

 두개의 정수를 매개변수로 받아서 첫번째 수를 두번째 수로 나눈 몫을 

 반환하는 메소드를 작성하시오.

 단 두번째 매개변수의 값이 0인 경우는 "0으로 나눌 수 없다" 를 출력.

 */

 public static int divide(int num1, int num2) {

  if(num2 ==0) {

   System.out.println("0으로 나눌수 없다.");

   return 0;

  }else {

 return num1/num2;

}

 }

 /*

 2. 

 매개변수로 1개의 정수를 받아서 받은 값까지 

 1. 안녕하세요.

 3. 안녕하세요.

 5. 안녕하세요.

 7. 안녕하세요.

 9. 안녕하세요.

 ..

 를 반복문을 이용해 출력하는 메소드를 작성하시오

 */

 

 public static void printHello(int num) {

  for(int idx = 1; idx <=num; idx++) { //{idx += 2) { 

   if(idx % 2 ==0) {

    continue;

   }

   System.out.println(idx + ".안녕하세요.");

   

  }

 }

 //리턴타입을 아무것도 안주겠다. -> void !! 따라서 호출후에 리턴할 것이 없다는 뜻

 

public static void /*출력만 할꺼기 때문에 반환할 값은 없다 */ printDan(int dan) {

  System.out.println(dan +"단 출력");

 for (int i = 1; i<=9; i++) {

  //System.out.println(dan+"X"+ i + "=" +( dan * i));

  System.out.printf("%d X %d = %d%n", dan, i, dan*i); 

  //0곱하기 0곱하기는 0인데 0는 나중에 알려줄게-->

  //%d:정수값이 들어올 자리 .

  //%f :실수값이 들어올 자리. 

  //%s :문자열이 들어올 자리.

  //%% : %를 넣겠다.

  //%n : 엔터 (엔터가 그 자리에 들어간다.)

  //printf : 전환문자 ..틀은 정해져 있고 그 들어잇는 숫자만 계속 바뀔떼

 }

 }

 public static void main(String[] args) {

  printDan(3);

  printDan(7);

  printDan(20);

  

  

//  printHello(10);

  //호풀 : [변수= ]메소드 이름([인수...])

//  int result = divide(10,5);

//  System.out.println(result);

//  result = divide(10,0);

//  System.out.println(result);

 }

/*

3. 매개변수로 1개의 정수를 받아 구구단의 그 정수 단을 출력하는

메소드를 작성하시오.

*/

 

}