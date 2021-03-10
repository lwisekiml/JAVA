import java.io.IOException;

public class ExceptionError {
	public static void main(String[] args) {
		/*
# 예외 처리
# 오류(error)와 예외(exception)
자바 문법에 맞지 않게 코드를 작성하고 컴파일하려고 하면, 자바 컴파일러는 문법 오류(syntax error)를 발생
문법에는 맞게 작성되었다 하더라도 프로그램이 실행되면서 예상하지 못한 오류가 발생할 수 있음
이렇게 컴퓨터 시스템이 동작하는 도중에 예상하지 못한 사태가 발생하여 실행 중인 프로그램이 영향을 받는 것을 오류(error)와 예외(exception) 두 가지로 구분할 수 있음

오류(error)는 시스템 레벨에서 프로그램에 심각한 문제를 야기하여 실행 중인 프로그램을 종료 시킴
이러한 오류는 개발자가 미리 예측하여 처리할 수 없는 것이 대부분이므로, 오류에 대한 처리는 할 수 없음 

예외(exception)는 오류와 마찬가지로 실행 중인 프로그램을 비정상적으로 종료시키지만, 발생할 수 있는 상황을 미리 예측하여 처리할 수 있음
예외 처리(exception handling)를 통해 예외 상황을 처리할 수 있도록 코드의 흐름을 바꿀 필요가 있음

예외 처리(exception handling)
프로그램이 실행되는 도중 발생하는 예외를 처리하기 위해 try / catch / finally 문을 사용할 수 있음

문법
try {
    예외를 처리하길 원하는 실행 코드;
} catch (e1) {
    e1 예외가 발생할 경우에 실행될 코드;
} catch (e2) {
    e2 예외가 발생할 경우에 실행될 코드;
}
...
finally {
    예외 발생 여부와 상관없이 무조건 실행될 코드;
}

1. try 블록 : 기본적으로 맨 먼저 실행되는 코드로 여기에서 발생한 예외는 catch 블록에서 처리
2. catch 블록 : try 블록에서 발생한 예외 코드나 예외 객체를 인수로 전달받아 그 처리를 담당함
3. finally 블록 : 이 블록은 try 블록에서 예외가 발생하건 안 하건 맨 마지막에 무조건 실행됨

catch 블록과 finally 블록은 선택적인 옵션으로 반드시 사용할 필요는 없음

적합한 try 구문
1. try / catch
2. try / finally
3. try / catch / ... / finally

다른 제어문과는 달리 예외 처리문은 중괄호({})를 생략할 수 없음
*/
/*
# 예외 클래스
# Exception 클래스
모든 예외의 조상 클래스가 되는 Exception 클래스는 크게 다음과 같이 구분할 수 있습니다.

1. RuntimeException 클래스
2. 그 외의 Exception 클래스의 자식 클래스

RuntimeException 클래스를 상속받는 자식 클래스들은 주로 치명적인 예외 상황을 발생시키지 않는 예외들로 구성
try / catch 문을 사용하기보다는 프로그램을 작성하면서 예외가 발생하지 않도록 주의를 기울이는 편이 좋음 

그 외의 Exception 클래스에 속하는 자식 클래스들은 치명적인 예외 상황을 발생시키므로, 반드시 try / catch 문을 사용하여 예외를 처리해야만 함
자바 컴파일러는 RuntimeException 클래스 이외의 Exception 클래스의 자식 클래스에 속하는 예외가 발생할 가능성이 있는 구문에는 반드시 예외를 처리하도록 강제하고 있음

PrintStream 클래스의 write() 메소드를 사용하여 byte 타입 배열의 모든 요소를 출력하는 예제
*/
//		byte[] list = {'a', 'b', 'c'};
//		System.out.write(list);

// 위 예제에서는 write() 메소드에서 발생할 수 있는 IOException에 대한 예외를 처리하지 않았으므로, 컴파일 시 오류 발생
// 다음 예제와 같이 try / catch 문을 사용하여 IOException에 대한 예외 처리까지 해 주어야만 컴파일 할 수 있음

		byte[] list = {'a', 'b', 'c'};

		try {
			System.out.write(list);
		} catch (IOException e) {
			e.printStackTrace();
		}	
/*
# 예외 처리의 계층 관계
예외가 발생하면, try 블록과 가장 가까운 catch 블록부터 순서대로 검사
여러 개의 catch 블록을 사용할 때는 Exception 클래스의 계층 관계에도 주의를 기울여야만 함
*/
try {
    System.out.write(list);
} catch (Exception e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
/*
위의 예에서 IOException이 발생하면, 자바는 첫 번째 catch 블록부터 순서대로 해당 예외를 처리할 수 있는지를 검사함
그런데 IOException은 Exception의 자식 클래스이므로, 첫 번째 catch 블록에서도 IOException을 처리할 수 있음
따라서 IOException을 비롯한 Exception 클래스의 자식 클래스에 해당하는 예외가 발생하면, 언제나 첫 번째 catch 블록에서만 처리함
즉, catch 블록의 순서를 위의 예제처럼 작성하면, 두 번째 catch 블록은 영원히 실행되지 못함
따라서 IOException만을 따로 처리하고자 한다면, 다음 예제처럼 catch 블록의 순서를 변경해야 함
*/
try {
    System.out.write(list);
} catch (IOException e) {
    e.printStackTrace();
} catch (Exception e) {
    e.printStackTrace();
}
/*
위의 예제에서 IOException이 발생하면, 첫 번째 catch 블록에서 해당 예외를 처리할 것임
또한, IOException 외의 Exception 클래스의 자식 클래스에 해당하는 예외가 발생하면, 두 번째 catch 블록에서 처리될 것임
범위가 더 좁은 예외를 처리하는 catch 블록을 먼저 명시하고, 범위가 더 넓은 예외를 처리하는 catch 블록은 나중에 명시해야만 정상적으로 해당 예외를 처리할 수 있음

# 여러 예외 타입의 동시 처리
Java SE 7부터는 '|' 기호를 사용하여 하나의 catch 블록에서 여러 타입의 예외를 동시에 처리할 수 있습니다.
즉, Java SE 7부터는 위의 예제를 다음 예제처럼 표현할 수 있게 되었습니다.
*/
try {
    this.db.commit();
} catch (IOException | SQLException e) {
    e.printStackTrace();
}
/*
하지만 둘 이상의 예외 타입를 동시에 처리하는 catch 블록에서 매개변수로 전달받은 예외 객체는 묵시적으로 final 제어자를 가지게 됨
catch 블록 내에서 해당 매개변수에는 어떠한 값도 대입할 수 없음

# Throwable 클래스
자바에서 Throwable 클래스는 모든 예외의 조상이 되는 Exception 클래스와 모든 오류의 조상이 되는 Error 클래스의 부모 클래스
Throwable 타입과 이 클래스를 상속받은 서브 타입만이 자바 가상 머신(JVM)이나 throw 키워드에 의해 던져질 수 있음
이 클래스에는 예외나 오류에 관한 다양한 정보를 확인할 수 있는 다음과 같은 메소드가 포함되어 있음

메소드					설명
String getMessage()		해당 throwable 객체에 대한 자세한 내용을 문자열로 반환함.
void printStackTrace()	해당 throwable 객체와 표준 오류 스트림(standard error stream)에서 해당 객체의 스택 트레이스(stack trace)를 출력함.
String toString()		해당 throwable 객체에 대한 간략한 내용을 문자열로 반환함.

일부러 숫자를 0으로 나눠 ArithmeticException 오류를 발생시키는 예제
발생한 오류에 대해 Throwable 메소드를 사용하여 발생한 오류에 대한 정보를 출력
*/
try {
    System.out.println(5 / 0);
} catch (ArithmeticException e) {
    System.out.println("현재 발생한 예외 정보 : " + e.getMessage());
}
/*
실행 결과
현재 발생한 예외 정보 : / by zero
*/

/*
# 자주 사용되는 예외 클래스
자바에서 자주 사용되는 예외 클래스는 다음과 같습니다.

클래스							설명
ClassCastException				수행할 수 없는 타입 변환이 진행될 경우
ArrayIndexOutOfBoundsException	배열에 잘못된 인덱스를 사용하여 접근할 경우
NullPointerException			null 객체의 인스턴스 메소드를 호출하는 등의 경우
ArithmeticException				산술 연산에서 정수를 0으로 나누는 등 연산을 수행할 수 없는 경우
*/
}
}
