package echo.ex04;

public class Multithread {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new DigitRunableImpl());
		thread.start();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
