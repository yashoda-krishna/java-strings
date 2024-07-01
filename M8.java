package strings_app1;

import java.util.Scanner;

public class M8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		System.out.println(s1.length());
		System.out.println("read all the characters in the forward direction");
		for(int i =0;i<s1.length() - 1;i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("read all the characters in the reverse direction");
		for(int j=s1.length() - 1;j>=0;j--) {
			System.out.print(s1.charAt(j));
		}
		System.out.println(s1);
	}
}
