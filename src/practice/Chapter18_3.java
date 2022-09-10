package practice;

public class Chapter18_3 {
	public static void main(String[] args) {
		
		String a = "\\d{3}-\\d{4}";
		String b = "400-8789";
		String c = "988-087";
		 
		System.out.println(b.matches(a));
		System.out.println(c.matches(a));
		
		String d = "0[789]0-\\d{4}-\\d{4}";
		String e = "080-6142-2795";
		String f = "098-7463-787";
		
		System.out.println(e.matches(d));
		System.out.println(f.matches(d));
		
		String g = ([ 012])
		
		
		

}
}