package echo.ex05;

public class DigitThread implements Runnable {

	public void run() {
		for (int i = 0; i <= 9; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
