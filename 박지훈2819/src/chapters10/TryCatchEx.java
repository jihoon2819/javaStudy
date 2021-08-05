package chapters10;

/**
 * 
 * 예외처리(Exception)
 * 
 *
 */


public class TryCatchEx {
	
	public void arrTest()throws ArrayIndexOutOfBoundsException{
		int[] arr = new int[5];
		
		for(int i =0 ; i <=5 ; i++) {
			arr[i]=i;
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		TryCatchEx tc = new TryCatchEx();
		
		
		try {
			tc.arrTest();
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 크기가 최대 5입니다 5개의 이상의 데이터는 추가 할 수 없습니다");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다 예외코드를 복사하여 개발자에게 문의 하세요.");
		}finally	{
			System.out.println("자료 저장");
		}
		
		

	}

}
