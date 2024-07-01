package strings_app1;

public class M4 {
	public static void main(String[] args) {
		String s1 = "hello";
		for(int i = 0;i<s1.length();i++){
			System.out.println(s1.charAt(i));
		}
		for(int i = s1.length() - 1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
	}
}

