package strings_app1;

public class M3 {
	public static void main(String[] args) {
		String s1 = "hello";
		//         0123
		System.out.println(s1);
		System.out.println(s1.length());
		for(int i =0;i<s1.length() ;i++) {
			System.out.println(s1.charAt(i)+",");
		}
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(s1.length() - 1));
		
		
	}
}
