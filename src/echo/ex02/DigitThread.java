package echo.ex02;

public class DigitThread extends Thread {

	
	@Override
	public void run() { //우리로직 코드 반드시 run()에 작성해야함
		//0~9 출력
		for(int i=0; i<=9; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	
}
