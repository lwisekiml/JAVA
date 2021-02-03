/* super
 * super는 부모클래스로 부터 상속받은 필드, 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수
 * 인스턴스 변수의 이름과 지역변수의 이름이 같을 경우 인스턴스 변수 앞에  this키워드를 사용하여 구분 가능
 * 부모 클래스의 멤버와 자식 클래스의 멤버 이름이 같을 경우 super키워드를 사용하여 구별 가능
 * this와 같이 super 참조 변수를 사용할 수 있는 대상도 인스턴스 메소드 뿐, 클래스 메소드(static method)에서는 사용X
 */
class Parent1 { int a = 10; }

class Child2 extends Parent1 {
    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

/*
 * super() 메소드 
 * this() 메소드가 같은 클래스의 다른 생성자를 호출할 때 사용된다면,
 * super() 메소드는 부모 클래스의 생성자를 호출할 때 사용
 * 자식 클래스의 인스턴스를 생성하면, 해당 인스턴스에는 자식 클래스의 고유 멤버뿐만 아니라 부모 클래스의 모든 멤버까지도 포함되어 있습니다.
 * 따라서 부모 클래스의 멤버를 초기화하기 위해서는 자식 클래스의 생성자에서 부모 클래스의 생성자까지 호출해야만 합니다.
 * 이러한 부모 클래스의 생성자 호출은 모든 클래스의 부모 클래스인 Object 클래스의 생성자까지 계속 거슬러 올라가며 수행됩니다.
 * 따라서 자바 컴파일러는 부모 클래스의 생성자를 명시적으로 호출하지 않는 모든 자식 클래스의 생성자 첫 줄에 자동으로 다음과 같은 명령문을 추가하여,
 * 부모 클래스의 멤버를 초기화할 수 있도록 해줍니다.
 * super();
 */

// 오류 발생 상황
class Parent3 {
    int a;
    Parent3(int n) { a = n; } // 생성자가 있을 경우 기본 생성자 자동 추가X
}

class Child4 extends Parent3 {
    int b;
    Child4() {
        super(); // 부모클래스에 기본 생성자가 추가되어 있지 않아 오류!!!
        b = 20;
    }
}
///////////////

// 정상
class Parent5 {
    int a;
    Parent5() {a = 10; }
    Parent5(int n) { a = n; } // 생성자가 있을 경우 기본 생성자 자동 추가X
}

class Child6 extends Parent5 {
    int b;
    Child6() {
        super(40); // 부모클래스에 기본 생성자가 추가되어 있지 않아 오류!!!
        b = 20;
    }
    
    void display() {
    	System.out.println(a);
    	System.out.println(b);
    }
}

public class Super {
    public static void main(String[] args) {
    	// super ex
    	Child2 ch2 = new Child2();
    	ch2.display();
    	
    	System.out.println("----");
    	
    	// super() ex
    	Child6 ch6 = new Child6();
    	ch6.display();
    }
}