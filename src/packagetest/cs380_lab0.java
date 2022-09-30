package packagetest;

public class cs380_lab0 {

	public static void main(String[] args) {
		System.out.println("First Lab CS 380");
		int toReverse = 12345;
		int reversed = 0;

		System.out.println("Num to reverse: " + toReverse);
		
		while (toReverse > 0) {
			reversed *= 10;
			reversed += toReverse % 10;
			toReverse /= 10;
		}

		System.out.println("Num reversed: " + reversed);
		System.out.println("First Lab CS 380 completed!");
	}

}
