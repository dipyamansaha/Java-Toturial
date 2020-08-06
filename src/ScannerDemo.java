import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int a = input.nextInt();
			System.out.println("Integer : " + a);

			char b = input.next().charAt(0);
			System.out.println("Character : " + b);

			double d = input.nextDouble();
			System.out.println("Double : " + d);

			long l = input.nextLong();
			System.out.println("Long : " + l);

			float f = input.nextFloat();
			System.out.println("Float : " + f);

			String name = input.next();
			System.out.println("Name : " + name);
		}
	}
}
