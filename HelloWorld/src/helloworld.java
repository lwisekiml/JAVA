
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
		System.out.println("~ �����ڿ� ���� ��� : "+ ~num1);
		System.out.println("<< �����ڿ� ���� ��� : "+ (num1 << 2));
		System.out.println(">> �����ڿ� ���� ��� : "+ (num2 >> 2));
		System.out.println(">>> �����ڿ� ���� ��� : "+ (num1 >>> 2));
		System.out.println(">>> �����ڿ� ���� ��� : "+ (num2 >>> 2));

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

		System.out.println("float��  ���� num3 : " + num3);
		System.out.println("double�� ���� num4 : " + num4);
		
		System.out.println("-- logical operator ---");

		char ch1 = 'b', ch2 = 'B';
		boolean result1, result2;
	 
		result1 = (ch1 > 'a') && (ch1 < 'z') ;
		result2 = (ch2 < 'A') || (ch2 < 'Z') ;

		System.out.println("&& �����ڿ� ���� ��� : "+ result1);
		System.out.println("|| �����ڿ� ���� ��� : "+ result2);
		System.out.println("! �����ڿ� ���� ��� : "+ !result2);
	
		System.out.println("-- array ---");
		int[] grade1 = new int[3]; // ���̰� 3�� int�� �迭�� ���� �� ����
		int[] grade2 = new int[3]; // ���̰� 3�� int�� �迭�� ���� �� ����
		
		grade1[0] = 85; // �ε����� �̿��� �迭�� �ʱ�ȭ
		grade1[1] = 65;
		grade1[2] = 90;

		grade2[0] = 85; // �迭�� ���̺��� ���� ���� �迭 ��Ҹ� �ʱ�ȭ

		for (i = 0; i < grade1.length; i++) {
		    System.out.print(grade1[i] + " "); // �ε����� �̿��� �迭���� ����
		}
		System.out.println();
		for (i = 0; i < grade2.length; i++) {
		    System.out.print(grade2[i] + " "); // �ε����� �̿��� �迭���� ����
		}
	}
}
