package week2.day1;

public class PalindromeString {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		char[] chararr=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+chararr[i];
		}
		if(str.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
