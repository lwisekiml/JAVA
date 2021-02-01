/*
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

public class Super {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.display();
    }
}