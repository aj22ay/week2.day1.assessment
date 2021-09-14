package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		String str="$$ Welcome to 2nd Class of Automation $$";
		int num=0,letter=0,specialChar=0,space=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isDigit(arr[i]))
				num++;
			else if(Character.isLetter(arr[i]))
				letter++;
			else if(Character.isSpace(arr[i]))
				space++;
			else
				specialChar++;
		}
		System.out.println("letter:      " +letter);
		System.out.println("space:       " +space);
		System.out.println("number:      " +num);
		System.out.println("specialchar: " +specialChar);
	}

}
