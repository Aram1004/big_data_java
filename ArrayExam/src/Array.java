
public class Array{

 public static void arrayTest1() {

  //�迭 - ���� Ÿ���� ������ ��� �����ϴ� ����� (��ü)

  //1. �迭Ÿ�� ���� ����. datetype[]������

   int[] arr; //arr:int[] *��Ʈ�迭Ÿ�� =! intŸ�԰� �ٸ����̴�.

   

   //2.�迭�� ���� (������ ����) - new datatype[length] : length �� int��

   arr = new int[3]; //���� 3���� ���� ���ִ� �迭 ����. 

   //3. �迭 �ʱ�ȭ. �迭�� ���(����)���� ó�� �ִ°�.

   // �迭����[index]=��; index : 0���� ���� ~ length-1 ���� 

   

   arr[0] = 10;//<- �ʱ�ȭ.

   arr[1] = 20;

   arr[2] = 30;

   //�迭�� ����ȭ �ؼ� ����� �� ������ ���� �����ϰ� ~~

   //4. �迭���.-�� ���Ҹ� ��ȸ: ����[index], ���� - ����[index]= ��;

   System.out.println(arr[0]); //0�� index�� ��ȸ �ؼ� ���

   System.out.println(arr[0]+arr[1]+arr[2]);

   arr[2] = 5000; //30->5000���� ����

   System.out.println(arr[2]);

   

 }

 public static void arrayTest2() {

  //��������, �迭����, �ʱ�ȭ�� �� �������� ó��.

  boolean[] bArr /*<-����*/ = {true,true,false,true};

  double[] dArr = {10.5, 20.7, 3.5, 50};

  

  //�迭.length : �迭�� ũ�⸦ �˼� �ִ�.

  System.out.println(bArr.length);

  System.out.println(dArr.length);

  

  //bArr�迭�� ��� ���Ҹ� ���

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

   

   

   System.out.printf("�迭 �� �հ�: %d%n", result);

   }

  

  

  public static void arrayFor2() {

   int [] arr = {1,2,3,4,5};

   //���� for�� - JDK 1.5���� ��밡��.

   //for(���Ҹ� ������ �������� : �迭")

   for( int num : arr) {

    System.out.println(num);

   }

  }

  

  //int[] a = new int[] {10,20,30};

 

 

 public static void main(String[] args) {

  arrayFor2();

  int [] arr = {10,20,30,40,50};

  //sumArray(arr);

  //���� �޼ҵ带 ȣ���Ҷ� main���� ȣ����

  //arrayTest2();//ȣ���� ���� ������ ��ȣ�� �� �����Ѵ�. 

 }

 //������ ���� ���� �� �ִ� ������ �ְ� �� ����ȿ� ������ �ִ°��� = �迭Ÿ��== int[] Ÿ���̶�� ��

 

}