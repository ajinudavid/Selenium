package com.methodConcepts;

public class Palindrome {

public static void main(String[] args) {
String s="MadaM";
Palindrome p=new Palindrome();
if(p.isPal(s))
{
	System.out.println("palindrome");
	}
else
{
	System.out.println("not palindrome");
	}}
	boolean isPal(String s)
	{
		char[]charArray=s.toCharArray();
		int length=charArray.length-1;
		for(int i=0;i<=charArray.length/2;i++)
		{
			if(charArray[i]!=charArray[length-i])
			{
	return false;
		}
		
		}
	return true;
	}

}
