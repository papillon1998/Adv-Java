package threads_example;

public class ThreadEx extends Thread {

	@Override
	public void run() {
		for (int i=0; i<=3; i++) {
			System.out.println(i+ " " + this.getName());
		}

	}

//	public Integer calaculate(Integer num1, Integer num2) {
//		return num1+num2;
//	}

}
