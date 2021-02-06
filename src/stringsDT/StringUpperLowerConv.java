package stringsDT;

public class StringUpperLowerConv {
	public static void main(String[] args) {

		String s = "I love India";
		StringBuffer newString = new StringBuffer(s);

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLowerCase(s.charAt(i))) {
				newString.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			} else if (Character.isUpperCase(s.charAt(i))) {
				newString.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.println("String after case conversion is =" + newString);

	}

}
