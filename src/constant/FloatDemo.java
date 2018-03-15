package constant;

public class FloatDemo {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		char c = '\u005d';
		
		double d = 1.23e1;
		
		int n = 5;
		System.out.println("n="+n+c);
		change(n);
		System.out.println("n="+(int)d);

	}
	
	static void change(int n) {
		n = 4;
	}

}
