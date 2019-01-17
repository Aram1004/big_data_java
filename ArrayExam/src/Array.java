
public class Array{

 public static void arrayTest1() {

  //배열 - 같은 타입의 값들을 모아 관리하는 저장소 (객체)

  //1. 배열타입 변수 선언. datetype[]변수명

   int[] arr; //arr:int[] *인트배열타입 =! int타입과 다른것이다.

   

   //2.배열을 생성 (변수에 대입) - new datatype[length] : length 는 int값

   arr = new int[3]; //정수 3개를 모을 수있는 배열 생성. 

   //3. 배열 초기화. 배열에 요소(원소)들을 처음 넣는것.

   // 배열변수[index]=값; index : 0부터 시작 ~ length-1 까지 

   

   arr[0] = 10;//<- 초기화.

   arr[1] = 20;

   arr[2] = 30;

   //배열을 변수화 해서 만들고 그 변수에 값을 지정하고 ~~

   //4. 배열사용.-값 원소를 조회: 변수[index], 변경 - 변수[index]= 값;

   System.out.println(arr[0]); //0번 index값 조회 해서 출력

   System.out.println(arr[0]+arr[1]+arr[2]);

   arr[2] = 5000; //30->5000으로 변경

   System.out.println(arr[2]);

   

 }

 public static void arrayTest2() {

  //변수선언, 배열생성, 초기화를 한 구문으로 처리.

  boolean[] bArr /*<-선언*/ = {true,true,false,true};

  double[] dArr = {10.5, 20.7, 3.5, 50};

  

  //배열.length : 배열의 크기를 알수 있다.

  System.out.println(bArr.length);

  System.out.println(dArr.length);

  

  //bArr배열의 모든 원소를 출력

  for (int idx = 0; idx < bArr.length; idx++) {

   System.out.println(bArr[idx]);

   } 

  for (int i = 0; i< dArr.length; i++) {

   System.out.println(dArr[i]);}

  }

  

  public static void sumArray(int[] arr) {

   int result = 0;

   for(int i=0; i <arr.length; i++) {

    result = result+ arr[i];

   }

   

   

   System.out.printf("배열 총 합계: %d%n", result);

   }

  

  

  public static void arrayFor2() {

   int [] arr = {1,2,3,4,5};

   //향상된 for문 - JDK 1.5부터 사용가능.

   //for(원소를 지정할 변수선언 : 배열")

   for( int num : arr) {

    System.out.println(num);

   }

  }

  

  //int[] a = new int[] {10,20,30};

 

 

 public static void main(String[] args) {

  arrayFor2();

  int [] arr = {10,20,30,40,50};

  //sumArray(arr);

  //위의 메소드를 호출할때 main에서 호출함

  //arrayTest2();//호출할 값이 없더라도 괄호는 꼭 들어가야한다. 

 }

 //변수에 값을 담을 수 있는 가방을 넣고 그 가방안에 값들을 넣는개념 = 배열타입== int[] 타입이라고 함

 

}