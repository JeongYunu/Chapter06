package echo.ex02;

public class MultithreadApp {

	public static void main(String[] args) {
		
		Thread thread = new DigitThread();
		thread.start(); // start() 내부에 출장준비(이동, 자리세팅) --> run실행
		
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
