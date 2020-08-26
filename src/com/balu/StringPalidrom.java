package com.balu;

public class StringPalidrom {

	public static void main(String[] args) {
		
		String s= "malayalam";
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				System.out.println("NotPalindrom");
				return;
			}
		}
		System.out.println("Palindrom");
	}

}
