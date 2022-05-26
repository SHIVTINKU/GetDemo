package Pojo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	String s="abaaaabaaaaabaaaab";
	
	int x=s.indexOf("ab");
	
	while(x!=-1) 
	
	{
		
		System.out.println("occurance at"+x);
		
		x=s.indexOf("ab",x+2);
		
	}
				
				

	
	System.out.println(checkVowel('m'));
	
	
	}
	
	public static boolean checkVowel(char ch)
	{
		
		
		return "aeiouAEIOU".indexOf(ch)>=0;
	}

}
