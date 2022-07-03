package String;

public class removeConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0) == str.charAt(1)) {
			return removeConsecutiveDuplicates(str.substring(1));
		}else {
			return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geeksforgeeks";
		System.out.println(removeConsecutiveDuplicates(s1));

	}

}
