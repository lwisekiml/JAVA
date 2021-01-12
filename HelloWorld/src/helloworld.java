
public class helloworld {

	public static void main(String[] args) {
		int n = 5;
		boolean exp = true;

		System.out.println("Hello World");
		System.out.println(n);

		System.out.println("--- if ---");
		if (exp)
			System.out.println("true");
		else
			System.out.println("false");

		System.out.println("--- while ---");
		int i = 1;
		while(true) {
			System.out.println(i);
			i++;
			if(i > 5)
				break;
		}

		System.out.println("--- for ---");
		for(i = 5; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("-- Condition Operator ---");
		int b = (5 < 4) ? 50 : 40;
		System.out.println(b);

		System.out.println("-- bitwise operator ---");
		int num1 = 8, num2 = -8;
		System.out.println("~ 연산자에 의한 결과 : "+ ~num1);
		System.out.println("<< 연산자에 의한 결과 : "+ (num1 << 2));
		System.out.println(">> 연산자에 의한 결과 : "+ (num2 >> 2));
		System.out.println(">>> 연산자에 의한 결과 : "+ (num1 >>> 2));
		System.out.println(">>> 연산자에 의한 결과 : "+ (num2 >>> 2));

		System.out.println("-- continue ---");
		for (i = 1; i <= 100; i++) {
			if (i % 5 == 0 || i % 7 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
		
		System.out.println("-- floating point ---");
		double num = 0.1;

		for(i = 0; i < 1000; i++) {
		    num += 0.1;
		}
		System.out.println(num);
		
		float num3 = 1.23456789f;
		double num4 = 1.23456789;

		System.out.println("float형  변수 num3 : " + num3);
		System.out.println("double형 변수 num4 : " + num4);
		
		System.out.println("-- logical operator ---");

		char ch1 = 'b', ch2 = 'B';
		boolean result1, result2;
	 
		result1 = (ch1 > 'a') && (ch1 < 'z') ;
		result2 = (ch2 < 'A') || (ch2 < 'Z') ;

		System.out.println("&& 연산자에 의한 결과 : "+ result1);
		System.out.println("|| 연산자에 의한 결과 : "+ result2);
		System.out.println("! 연산자에 의한 결과 : "+ !result2);
	
	}
}
