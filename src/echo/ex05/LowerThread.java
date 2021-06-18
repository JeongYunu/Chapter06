package echo.ex05;

public class LowerThread implements Runnable {

	public void run() {
		for (char chLower = 'a'; chLower <= 'z'; chLower++) {
			System.out.println(chLower);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
