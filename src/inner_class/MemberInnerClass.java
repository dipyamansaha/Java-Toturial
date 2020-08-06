package inner_class;

public class MemberInnerClass {

	public static void main(String[] args) {

		// Create Object of outer Class
		OuterClass outerClass = new OuterClass();

		// Configure with Inner Class
		OuterClass.Inner in = outerClass.new Inner();

		// Then Call the Method
		System.out.println("Inner Classs Method :" + in.InnerMethod());
	
	}

}

@SuppressWarnings("static-access")
class OuterClass {

	private int outerVar = 234;

	class Inner {

		public String InnerMethod() {

			return new String().valueOf(outerVar);

		}
	}

}
