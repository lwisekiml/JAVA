import java.util.Arrays;

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
	
		System.out.println("-- 1 Dimension Array ---");
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
		
		System.out.println("\n--- 2 Dimension Array ---");
		int[][] arr = new int[2][3];
		 
		int k = 10;
		for (i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        arr[i][j] = k; // �ε����� �̿��� �ʱ�ȭ
		        k += 10;
		    }
		}

		for (i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("--- dynamic array ---");
		
		int[][] arr1 = {
				{10, 20},
			    {10, 20, 30, 40},
			    {10}
		};

		for (i = 0; i < arr1.length; i++) {
		    for (int j = 0; j < arr1[i].length; j++) {
		        System.out.print(arr1[i][j] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("--- array copy ---");

		int[] ar1 = new int[]{1, 2, 3, 4, 5};
		int newLen = 10;

		// 1. System Ŭ������ arraycopy() �޼ҵ�
		int[] ar2 = new int[newLen];
		System.arraycopy(ar1, 0, ar2, 0, arr1.length);

		for (i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		System.out.println();
		
		// 2. Arrays Ŭ������ copyOf() �޼ҵ�
		int[] ar3 = Arrays.copyOf(ar1, 10);

		for (i = 0; i < ar3.length; i++) {
			System.out.print(ar3[i] + " ");
		}
		System.out.println();
		
		// 3. Object Ŭ������ clone() �޼ҵ�
		int[] ar4 = (int[])ar1.clone();

		for (i = 0; i < ar4.length; i++) {
			System.out.print(ar4[i] + " ");
		}
		System.out.println();
		
		// 4. for ���� �ε����� �̿��� ����
		int[] ar5 = new int[newLen];
		
		for (i = 0; i < arr1.length; i++) {
			ar5[i] = ar1[i];
		}
		
		for (i = 0; i < ar5.length; i++) {
			System.out.print(ar5[i] + " ");
		}
		
		System.out.println("\n--- Enhanced for ---");
		for(int e : grade1) {
			e += 10;
			System.out.println(e);
		}
	}
}
