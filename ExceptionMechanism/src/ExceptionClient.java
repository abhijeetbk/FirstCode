import com.ExceptionHandler.ExceptionDemo;

public class ExceptionClient {

	public static void main(String[] args) {
		
		ExceptionDemo demo = new ExceptionDemo();
		try {
			//logic
			System.out.println(demo.getNumber());
		}catch(ArithmeticException e) {
			
			System.out.println("inside catch block ");
		}catch (Exception e) {
			
			e.printStackTrace();
		}
//		}finally {
//			System.out.println("inside finally");
//		}
		
		//code 
	}

}
