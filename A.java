package strings_app1;

public class A {
public static void main(String[] args) {
	String s1 = "hello mom u r my love";
	System.out.println(s1);
	char[] c1 = s1.toCharArray();
	char[] c2 = new char[s1.length()];
	int j=0;
	for(int i=0; i < c1.length - 1;i++) {
		if(c1[i]!=' ') {
			if(c2[j] == ' ') {
				j++;
			}
			c2[j] = c1[i];
			j++;
		}
	}
	s1=new String(c2);
	System.out.println(s1);
}
}
