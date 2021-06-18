package echo.ex03;

public class UpperThread extends Thread {

	public void run() {
		for (char chUpper = 'A'; chUpper <= 'Z'; chUpper++) {
			System.out.println(chUpper);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
