import java.util.Arrays;

/*
// final
final class Car {                    // �� Ŭ������ ����� ���� ���� Ŭ������ ������ �� ����.
    final int VAR;                   // �� �ʵ�� ���ȭ�Ǿ� ���� ������ �� ����.
    final void brake() {             // �� �޼ҵ�� �������̵��� ���� �������� �� ����.
        final double MAX_NUM = 10.2; // �� ���� ������ ���ȭ�Ǿ� ���� ������ �� ����.
    }
}
*/

// static
class Car_ {
    static int var;       // Ŭ���� �ʵ�(static ����)
    static {              // static �ʱ�ȭ ���
    // ���� Ŭ���� �ʵ��� �ʱ�ȭ�� ������.
    }
    static void brake() { // Ŭ���� �޼ҵ�(static �޼ҵ�)
    }
}
/*
// �ʵ� �ʱ�ȭ
class Field {
	static int classVar = 10; // Ŭ���� ������ ����� �ʱ�ȭ
	int instanceVar = 20;     // �ν��Ͻ� ������ ����� �ʱ�ȭ
}
*/
class Car {                    // Ŭ���� �̸�
    private String modelName;  // �ʵ�
    private int modelYear;     // �ʵ�
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    private int instanceTest;
    
    public String var = "�������� ���"; // public �ʵ�
    
    {
    	this.instanceTest = 77;
    }
    
    public int getSpeed() {
    	return instanceTest;
    }
    Car(String modelName, int modelYear) { // ������
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    
    Car() {
        this("�ҳ�Ÿ", 2012, "������", 160); // �ٸ� �����ڸ� ȣ����.
    }

    public String getModel() {
        return this.modelYear + "��� " + this.modelName + " " + this.color;
    }
    
    public void accelerate(int speed, int second) {
        System.out.println(second + "�ʰ� �ӵ��� �ü� " + speed + "(��)�� ������!!");
    }
    
    static void display(int num1) { System.out.println(num1); }
    static void display(int num1, int num2) { System.out.println(num1 * num2); }
    static void display(int num1, double num2) { System.out.println(num1 + num2); }
    
    public int gcs(){
    	return getCurrentSpeed();
    }
    
    // private
    private int getCurrentSpeed() {                  // private �޼ҵ�
        return this.currentSpeed;
    }
    
    // public
    public String getVar() {             // public �޼ҵ�
        return this.var;
    }
}

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
		
		System.out.println("--- Class ---");
		Car myCar = new Car("��", 2021);
		System.out.println(myCar.getModel());
		
		System.out.println("--- method ---");
		Car car = new Car();
		car.accelerate(60, 3); // �޼ҵ� ȣ��
		
		System.out.println("\n--- this/this() ---");
		Car tcpCar = new Car();
		System.out.println(tcpCar.getModel());
		
		
		System.out.println("\n--- method overloading ---");
		Car overloading = new Car();
		overloading.display(10);
		overloading.display(10,20);
		overloading.display(10,3.14);
		overloading.display(10,'a');
		
		System.out.println("\n--- recursive call ---");
		System.out.println(recursiveSum(5));
		
		System.out.println("--- access modifier ---");
		System.out.println("--- private (������ class������ ���� ����) ");
		System.out.println(myCar.gcs());
		// myCar.getCurrentSpeed(); // ���� �Ұ���
		
		System.out.println("--- public (��� ������ ���� ����/�Ϲ� class, �ڽ� class, �ٸ� ��Ű�� �Ϲ� class, �ٸ� ��Ű�� �ڽ� class) ");
		System.out.println(myCar.getVar());
		
		System.out.println("--- instance ---");
		Car carInstance = new Car(); // instance create
		System.out.println(carInstance.getSpeed()); // instance method load
	}
	
	static int recursiveSum(int n) {
	    if (n == 1) {                 // n�� 1�̸�, �׳� 1�� ��ȯ��.
	        return 1;
	    }
	    return n + recursiveSum(n-1); // n�� 1�� �ƴϸ�, n�� 1���� (n-1)������ �հ� ���� ���� ��ȯ��.
	}
}
