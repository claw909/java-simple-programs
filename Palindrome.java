package practice2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
       	 rev=rev+s.charAt(i);
        System.out.println(rev);
        if(rev.equalsIgnoreCase(s))
        	System.out.println("Palindrome ");
        else
        	System.out.println("Not a Palindrome");

	}

}
