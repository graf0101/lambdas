package lambdas.ch03;

public class ThreadLambdasMultipleStatement {

	public static void main(String[] args) {

		Runnable r = () -> findFirstTenPrimeNumbers();

		Thread t = new Thread(r);
		t.start();
	}

	private static Object findFirstTenPrimeNumbers() {
		return null;
	}
}