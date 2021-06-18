package echo.ex03;

public class LowerThread extends Thread {

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
