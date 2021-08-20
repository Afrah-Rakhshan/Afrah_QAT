package Q1;

import java.util.*;

public class RevString {

public static void main(String[] args) {
		
		ArrayList<String> arr= new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of String");
		int n=sc.nextInt();
		
		System.out.println("Enter the String");
		for(int i=0;i<n;i++){
			String el=sc.next();
			arr.add(el);
		}
		System.out.println("Reverse is:");
		for(int i=n-1;i>=0;i--){
			String curelement=arr.get(i);
			System.out.print(curelement + " ");
		}
		
		sc.close();
	}

}
