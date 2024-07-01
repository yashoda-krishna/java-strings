package strings_app1;

public class M7 {
	public static void main(String[] args) {
		String s1 = "hello Indians";
		//           01234567890
		System.out.println(s1.length());
		System.out.println(s1.charAt(s1.length()-1));
		System.out.println("read all the characters in the forward direction");
		for(int i =0;i<s1.length()-1;i++) {
			System.out.println(s1.charAt(i)+",");
		}
		System.out.println();
		System.out.println("read all the characters in the reverse direction");
		for(int i=s1.length()-1;i>0;i--) {
			System.out.println(s1.charAt(i)+",");
		}
		for(int k=s1.length()-1;k>0;k--) {
			System.out.print(s1.charAt(k));
		}
		System.out.println();
	}
}
