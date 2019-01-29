/* WAP to demonstrate the concept of String, StringBuffer and StringBuilder
 */

package Java.strings;

public class StringsStringBuffersStringBuilder {

	// Concatenates to String

	public static void concat(String s1)

	{

		s1 = s1 + "Tendulkar";

	}

	// Concatenates to StringBuilder

	public static void concat(StringBuilder s2)

	{

		s2.append("Tendulkar");

	}

	// Concatenates to StringBuffer

	public static void concat(StringBuffer s3)

	{

		s3.append("Tendulkar");

	}

	public static void main(String[] args)

	{

		String s1 = "Sachin";

		concat(s1); // s1 is not changed

		System.out.println("String: " + s1);

		StringBuilder s2 = new StringBuilder("Sachin");

		concat(s2); // s2 is changed

		System.out.println("StringBuilder: " + s2);

		StringBuffer s3 = new StringBuffer("Sachin");

		concat(s3); // s3 is changed

		System.out.println("StringBuffer: " + s3);

	}

}
