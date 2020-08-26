package com.balu;

public class Swapping {
	public static void main(String[] args)
	{
	    StringBuffer sb = new StringBuffer("abc");
		appendSomething(sb);
		System.out.println(sb.toString());
	}

	public static void appendSomething(StringBuffer sb_i)
	{
	    sb_i.append("d");
	}
}
