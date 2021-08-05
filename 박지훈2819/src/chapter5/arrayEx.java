package chapter5;
/**
 * 
 * array(배열)
 * ->같은 자료혈의 데이터끼리의 집함
 * ->데이터의 묶음
 * 
 * [](대괄호)인덱스를 사용하면 무조건 배열이다.
 * []인덱스 연산자
 * int num1,num2,num3,num4,num5;
 * num=0;
 * int num1=1;
 * int num2=2;
 * int num3=3;
 * int num4=4;
 * int num5=5;
 * 
 * 	System.out.println(num);
 * 	System.out.println(num1);
 * 	System.out.println(num2);
 * 	System.out.println(num3);
 * 	System.out.println(num4);
 * 	System.out.println(num5);
 * 
 * int[] num=new int[6(인덱스의 갯수)];
 * num[0]=0;
 * num[1]=1;
 * num[2]=2;
 * num[3]=3;
 * num[4]=4;
 * num[5]=5;
 * 
 * int i=0;
 * num[i];
 * int i=5;
 * num[i]의 결과는 5
 * 
 * for(int i=0;i<6;i++){
 * 		System.out.println(num[i]);
 * }
 * 
 */
public class arrayEx {

	public static void main(String[] args) {
		//배열의선언
		int[] arr;
		//int arr[];c언어에서 사용 자바도 가능 비추
		//배열 초기화(생성)
		arr=new int[10];
		//arr[]=0;
		//선언과 초기화를 동시에 진행
		int[] arr2 = new int[] {0,1,2,3,4,5,6,7,8,9};
		int[] arr3 = {0,1,2,3,4,5,6,7,8,9};//이형태도 가능
		//선언과 초기화를 동시에 할떄는 new int[]에서 안을 비워주어야 한다
		
		//arr = {0,1,2,3,4,5,6,7,8,9}; 사용불가
		
		for(int i =0;i<10;i++) {
			arr[i]=i;
			arr2[i]=i;
			arr3[i]=i;
			
		}
		//length 배열의 크기값 따라서 위의 식과 의미상은 같음//length를 쓰는 이유는 배열의 크기를 확인하지않아도 되기 떄문이다.
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
			
			System.out.println(arr2[i]);
			System.out.println(arr3[i]);
		}
		
	}

}
