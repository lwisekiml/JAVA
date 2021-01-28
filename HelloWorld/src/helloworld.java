import java.util.Arrays;

/*
// final
final class Car {                    // 이 클래스는 상속을 통해 서브 클래스를 생성할 수 없음.
    final int VAR;                   // 이 필드는 상수화되어 값을 변경할 수 없음.
    final void brake() {             // 이 메소드는 오버라이딩을 통해 재정의할 수 없음.
        final double MAX_NUM = 10.2; // 이 지역 변수는 상수화되어 값을 변경할 수 없음.
    }
}
*/

// static
class Car_ {
    static int var;       // 클래스 필드(static 변수)
    static {              // static 초기화 블록
    // 보통 클래스 필드의 초기화를 진행함.
    }
    static void brake() { // 클래스 메소드(static 메소드)
    }
}
/*
// 필드 초기화
class Field {
	static int classVar = 10; // 클래스 변수의 명시적 초기화
	int instanceVar = 20;     // 인스턴스 변수의 명시적 초기화
}
*/
class Car {                    // 클래스 이름
    private String modelName;  // 필드
    private int modelYear;     // 필드
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    private int instanceTest;
    
    public String var = "누구든지 허용"; // public 필드
    
    {
    	this.instanceTest = 77;
    }
    
    public int getSpeed() {
    	return instanceTest;
    }
    Car(String modelName, int modelYear) { // 생성자
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
        this("소나타", 2012, "검정색", 160); // 다른 생성자를 호출함.
    }

    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
    
    public void accelerate(int speed, int second) {
        System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
    }
    
    static void display(int num1) { System.out.println(num1); }
    static void display(int num1, int num2) { System.out.println(num1 * num2); }
    static void display(int num1, double num2) { System.out.println(num1 + num2); }
    
    public int gcs(){
    	return getCurrentSpeed();
    }
    
    // private
    private int getCurrentSpeed() {                  // private 메소드
        return this.currentSpeed;
    }
    
    // public
    public String getVar() {             // public 메소드
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
	
		System.out.println("-- 1 Dimension Array ---");
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
		
		System.out.println("\n--- 2 Dimension Array ---");
		int[][] arr = new int[2][3];
		 
		int k = 10;
		for (i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        arr[i][j] = k; // 인덱스를 이용한 초기화
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

		// 1. System 클래스의 arraycopy() 메소드
		int[] ar2 = new int[newLen];
		System.arraycopy(ar1, 0, ar2, 0, arr1.length);

		for (i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		System.out.println();
		
		// 2. Arrays 클래스의 copyOf() 메소드
		int[] ar3 = Arrays.copyOf(ar1, 10);

		for (i = 0; i < ar3.length; i++) {
			System.out.print(ar3[i] + " ");
		}
		System.out.println();
		
		// 3. Object 클래스의 clone() 메소드
		int[] ar4 = (int[])ar1.clone();

		for (i = 0; i < ar4.length; i++) {
			System.out.print(ar4[i] + " ");
		}
		System.out.println();
		
		// 4. for 문과 인덱스를 이용한 복사
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
		Car myCar = new Car("차", 2021);
		System.out.println(myCar.getModel());
		
		System.out.println("--- method ---");
		Car car = new Car();
		car.accelerate(60, 3); // 메소드 호출
		
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
		System.out.println("--- private (선언한 class에서만 접근 가능) ");
		System.out.println(myCar.gcs());
		// myCar.getCurrentSpeed(); // 접근 불가능
		
		System.out.println("--- public (모든 곳에서 접근 가능/일반 class, 자식 class, 다른 패키지 일반 class, 다른 패키지 자식 class) ");
		System.out.println(myCar.getVar());
		
		System.out.println("--- instance ---");
		Car carInstance = new Car(); // instance create
		System.out.println(carInstance.getSpeed()); // instance method load
	}
	
	static int recursiveSum(int n) {
	    if (n == 1) {                 // n이 1이면, 그냥 1을 반환함.
	        return 1;
	    }
	    return n + recursiveSum(n-1); // n이 1이 아니면, n을 1부터 (n-1)까지의 합과 더한 값을 반환함.
	}
}
