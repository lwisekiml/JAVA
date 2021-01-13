
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
	
		System.out.println("-- array ---");
		int[] grade1 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
		int[] grade2 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
		
		grade1[0] = 85; // 인덱스를 이용한 배열의 초기화
		grade1[1] = 65;
		grade1[2] = 90;

		grade2[0] = 85; // 배열의 길이보다 적은 수의 배열 요소만 초기화

		for (i = 0; i < grade1.length; i++) {
		    System.out.print(grade1[i] + " "); // 인덱스를 이용한 배열로의 접근
		}
		System.out.println();
		for (i = 0; i < grade2.length; i++) {
		    System.out.print(grade2[i] + " "); // 인덱스를 이용한 배열로의 접근
		}
	}
}
