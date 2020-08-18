package java_static;

import java.util.Random;

// Static variables Occupy the Memory Only once when class is Loading...

// Make program more Efficient...

public class StaticKeyword {
	int i = 10;

	public static void main(String[] args) {

		// Static Method call without class Object
		int staticVar = 99;
		showInteger(staticVar);

		// Here Occure Compile Time Error
		showInteger(i); // static method can not use non static variables and method

	}

	public static int showInteger(int i) {

		Random random = new Random(1);

		i = random.nextInt();

		System.out.println("In Static Methods : " + i);

		return i;

	}

	// Static Block is always First Executed Block in Java Program...
	static {

		System.out.println("Static Block Executed...");

	}

}
