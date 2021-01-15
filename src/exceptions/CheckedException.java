package exceptions;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("started");
		System.out.println("inProgress");

		/*try {
		Thread.sleep(5000);
		}catch (Exception e) {
			
		}*/
		Thread.sleep(3000);
		

		System.out.println("Completed");
		System.out.println("Exit");
	}

}
