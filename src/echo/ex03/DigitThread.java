package echo.ex03;

public class DigitThread extends Thread {

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
