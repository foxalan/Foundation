package constant;

public class HelloImooc {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		

		//八进制以0开头
		int x = 015;
		//0x
		int y = 0x123;
		//
		int z = 123;
		int m = x = z;
		float mn = 1.22f;
		double mnn = 123.20d;	
		
		System.out.println("the number is"+x);
		System.out.println("the number is"+y);
		System.out.println("the number is"+z);
		System.out.println("the number is"+mn);
		System.out.println("the number is"+mnn);
	//========================================================	
		
		float f1 = 98.4f;
		float f2 = f1;
		int n =55;
		double d1 = 555.3;
		d1=n;
		
	//========================================================

		char a = 'a';
		char ch = (char) 655555;
		System.out.println("a = "+a);
		System.out.println("ch = "+ch);

	}
}
