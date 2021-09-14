package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
	    char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean res=Arrays.equals(arr1, arr2);
		int len1=arr1.length;
		int len2=arr2.length;
		if(len1==len2)
		{
			if(res)
				System.out.println("anagram");
			else
				System.out.println("not anagram");
		}else
			System.out.println("not same string");
		
	}

}
