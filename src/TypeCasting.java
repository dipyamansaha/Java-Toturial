

public class TypeCasting {
	public static void main(String[] args) {

		// Automatic Conversion.
		// Byte -> Short -> int -> long -> float -> double
		int i = 20;
		float f = i;
		long l = i;

		System.out.println("int : " + i);
		System.out.println("int-to-float : " + f);
		System.out.println("int-to-long : " + l);

		// Explicit Type Conversion.
		// Double -> float -> long -> int -> short -> Byte
		char x = 10;
		int z = (int) x;
		System.out.println("char-to-int : " + z);

		int c = 10;
		float s = c;
		System.out.println("int-to-float : " + s);

		c = (int) s;
		System.out.println("float-to-int : " + c);

		long ll = 233;
		int ii = (int) ll;
		System.out.println("long-to-int : " + ii);
		
		// d % 256
		double d = 323.142;
		byte b = (byte) d;
		System.out.println("long-to-byte : " + b);
	
		// ii % 256
		b = (byte) ii;
		System.out.println("int to byte : " + b);
	}
}