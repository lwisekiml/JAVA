/* super
 * super�� �θ�Ŭ������ ���� ��ӹ��� �ʵ�, �޼ҵ带 �ڽ� Ŭ�������� �����ϴ� �� ����ϴ� ���� ����
 * �ν��Ͻ� ������ �̸��� ���������� �̸��� ���� ��� �ν��Ͻ� ���� �տ�  thisŰ���带 ����Ͽ� ���� ����
 * �θ� Ŭ������ ����� �ڽ� Ŭ������ ��� �̸��� ���� ��� superŰ���带 ����Ͽ� ���� ����
 * this�� ���� super ���� ������ ����� �� �ִ� ��� �ν��Ͻ� �޼ҵ� ��, Ŭ���� �޼ҵ�(static method)������ ���X
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
 * super() �޼ҵ� 
 * this() �޼ҵ尡 ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���ȴٸ�,
 * super() �޼ҵ�� �θ� Ŭ������ �����ڸ� ȣ���� �� ���
 * �ڽ� Ŭ������ �ν��Ͻ��� �����ϸ�, �ش� �ν��Ͻ����� �ڽ� Ŭ������ ���� ����Ӹ� �ƴ϶� �θ� Ŭ������ ��� ��������� ���ԵǾ� �ֽ��ϴ�.
 * ���� �θ� Ŭ������ ����� �ʱ�ȭ�ϱ� ���ؼ��� �ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڱ��� ȣ���ؾ߸� �մϴ�.
 * �̷��� �θ� Ŭ������ ������ ȣ���� ��� Ŭ������ �θ� Ŭ������ Object Ŭ������ �����ڱ��� ��� �Ž��� �ö󰡸� ����˴ϴ�.
 * ���� �ڹ� �����Ϸ��� �θ� Ŭ������ �����ڸ� ��������� ȣ������ �ʴ� ��� �ڽ� Ŭ������ ������ ù �ٿ� �ڵ����� ������ ���� ��ɹ��� �߰��Ͽ�,
 * �θ� Ŭ������ ����� �ʱ�ȭ�� �� �ֵ��� ���ݴϴ�.
 * super();
 */

// ���� �߻� ��Ȳ
class Parent3 {
    int a;
    Parent3(int n) { a = n; } // �����ڰ� ���� ��� �⺻ ������ �ڵ� �߰�X
}

class Child4 extends Parent3 {
    int b;
    Child4() {
        super(); // �θ�Ŭ������ �⺻ �����ڰ� �߰��Ǿ� ���� �ʾ� ����!!!
        b = 20;
    }
}
///////////////

// ����
class Parent5 {
    int a;
    Parent5() {a = 10; }
    Parent5(int n) { a = n; } // �����ڰ� ���� ��� �⺻ ������ �ڵ� �߰�X
}

class Child6 extends Parent5 {
    int b;
    Child6() {
        super(40); // �θ�Ŭ������ �⺻ �����ڰ� �߰��Ǿ� ���� �ʾ� ����!!!
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