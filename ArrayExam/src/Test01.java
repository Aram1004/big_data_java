public class Test01{

// �޼ҵ� ���� :[������] ����Ÿ�� �̸�([�Ű���������..]) {}

 /*

 1. 

 �ΰ��� ������ �Ű������� �޾Ƽ� ù��° ���� �ι�° ���� ���� ���� 

 ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�.

 �� �ι�° �Ű������� ���� 0�� ���� "0���� ���� �� ����" �� ���.

 */

 public static int divide(int num1, int num2) {

  if(num2 ==0) {

   System.out.println("0���� ������ ����.");

   return 0;

  }else {

 return num1/num2;

}

 }

 /*

 2. 

 �Ű������� 1���� ������ �޾Ƽ� ���� ������ 

 1. �ȳ��ϼ���.

 3. �ȳ��ϼ���.

 5. �ȳ��ϼ���.

 7. �ȳ��ϼ���.

 9. �ȳ��ϼ���.

 ..

 �� �ݺ����� �̿��� ����ϴ� �޼ҵ带 �ۼ��Ͻÿ�

 */

 

 public static void printHello(int num) {

  for(int idx = 1; idx <=num; idx++) { //{idx += 2) { 

   if(idx % 2 ==0) {

    continue;

   }

   System.out.println(idx + ".�ȳ��ϼ���.");

   

  }

 }

 //����Ÿ���� �ƹ��͵� ���ְڴ�. -> void !! ���� ȣ���Ŀ� ������ ���� ���ٴ� ��

 

public static void /*��¸� �Ҳ��� ������ ��ȯ�� ���� ���� */ printDan(int dan) {

  System.out.println(dan +"�� ���");

 for (int i = 1; i<=9; i++) {

  //System.out.println(dan+"X"+ i + "=" +( dan * i));

  System.out.printf("%d X %d = %d%n", dan, i, dan*i); 

  //0���ϱ� 0���ϱ�� 0�ε� 0�� ���߿� �˷��ٰ�-->

  //%d:�������� ���� �ڸ� .

  //%f :�Ǽ����� ���� �ڸ�. 

  //%s :���ڿ��� ���� �ڸ�.

  //%% : %�� �ְڴ�.

  //%n : ���� (���Ͱ� �� �ڸ��� ����.)

  //printf : ��ȯ���� ..Ʋ�� ������ �ְ� �� ����մ� ���ڸ� ��� �ٲ�

 }

 }

 public static void main(String[] args) {

  printDan(3);

  printDan(7);

  printDan(20);

  

  

//  printHello(10);

  //ȣǮ : [����= ]�޼ҵ� �̸�([�μ�...])

//  int result = divide(10,5);

//  System.out.println(result);

//  result = divide(10,0);

//  System.out.println(result);

 }

/*

3. �Ű������� 1���� ������ �޾� �������� �� ���� ���� ����ϴ�

�޼ҵ带 �ۼ��Ͻÿ�.

*/

 

}