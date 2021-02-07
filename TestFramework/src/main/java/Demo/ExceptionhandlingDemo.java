package Demo;

public class ExceptionhandlingDemo {

	public static void main(String[] args) {
		
		try {
		System.out.println("Hello World....!!");
		
		int i=1/0;
		
		System.out.println("completed");
		}
		
		catch (Exception e) {
			System.out.println("exception handled");
			System.out.println("message is:" +e.getMessage());
			System.out.println("message is:" +e.getCause());
			e.printStackTrace();
		}
finally {
	System.out.println("inside finally");
}
	}

}
