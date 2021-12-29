package model;

public class timeOut {
	
	public void TimeOut() {
		try {
			Thread.sleep(25000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
