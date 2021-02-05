/*
 * 메소드 오버라이딩(method overriding)
 * 오버로딩(overloading) : 서로 다른 시그니처를 갖는 여러 메소드를 하나의 이름으로 정의
 * 오버라이딩(overriding) : 상속 관계에 있는 부모 클래스에 이미 정의된 메소드를 자식 클래스에서 같은 시그니쳐를 갖는 메소드로 다시 정의
 * 부모 클래스의 private 멤버를 제외한 모든 메소드를 상속
 * 필요한 동작을 위해 재정의하여 사용할 수 있음
 * 메소드 오버라이딩 : 상속받은 부모 클래스의 메소드를 재정의하여 사용하는 것
 * 
 * 오버라이딩의 조건
 * 1. 메소드의 동작만을 재정의하는 것, 메소드의 선언부는 기존 메소드와 완전히 같아야 함
 * (하지만 메소드의 반환 타입은 부모 클래스의 반환 타입으로 타입 변환할 수 있는 타입이라면 변경할 수 있습니다.)
 * 2. 부모 클래스의 메소드보다 접근 제어자를 더 좁은 범위로 변경X
 * 3. 부모 클래스의 메소드보다 더 큰 범위의 예외 선언X
 */

class ParentOr {
    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }
}

class ChildOr extends ParentOr {
    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }
}

/*
 * 오버로딩과 오버라이딩
 * 오버로딩(overloading) : 새로운 메소드를 정의
 * 오버라이딩(overriding) : 상속받은 기존의 메소드를 재정의
 */

class ParentOrOl {
    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }
}

class ChildOrOl extends ParentOrOl {
    // 오버라이딩된 display() 메소드
    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }
    
    // 오버로딩된 display() 메소드
    void display(String str) { System.out.println(str); } 
}

public class Overloading_Overriding {
    public static void main(String[] args) {
        ParentOr pa = new ParentOr();
        pa.display();
        
        ChildOr ch = new ChildOr();
        ch.display();
        
        ParentOr pc = new ChildOr(); // 다형성(polymorphism) 때문에 가능
        pc.display();
        // Child cp = new Parent();
        
        System.out.println("-----");
        
        ChildOrOl chorol = new ChildOrOl();
        chorol.display();
        chorol.display("오버로딩된 display() 메소드입니다.");
    }
}
