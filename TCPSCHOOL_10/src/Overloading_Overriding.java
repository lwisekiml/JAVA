/*
 * �޼ҵ� �������̵�(method overriding)
 * �����ε�(overloading) : ���� �ٸ� �ñ״�ó�� ���� ���� �޼ҵ带 �ϳ��� �̸����� ����
 * �������̵�(overriding) : ��� ���迡 �ִ� �θ� Ŭ������ �̹� ���ǵ� �޼ҵ带 �ڽ� Ŭ�������� ���� �ñ״��ĸ� ���� �޼ҵ�� �ٽ� ����
 * �θ� Ŭ������ private ����� ������ ��� �޼ҵ带 ���
 * �ʿ��� ������ ���� �������Ͽ� ����� �� ����
 * �޼ҵ� �������̵� : ��ӹ��� �θ� Ŭ������ �޼ҵ带 �������Ͽ� ����ϴ� ��
 * 
 * �������̵��� ����
 * 1. �޼ҵ��� ���۸��� �������ϴ� ��, �޼ҵ��� ����δ� ���� �޼ҵ�� ������ ���ƾ� ��
 * (������ �޼ҵ��� ��ȯ Ÿ���� �θ� Ŭ������ ��ȯ Ÿ������ Ÿ�� ��ȯ�� �� �ִ� Ÿ���̶�� ������ �� �ֽ��ϴ�.)
 * 2. �θ� Ŭ������ �޼ҵ庸�� ���� �����ڸ� �� ���� ������ ����X
 * 3. �θ� Ŭ������ �޼ҵ庸�� �� ū ������ ���� ����X
 */

class ParentOr {
    void display() { System.out.println("�θ� Ŭ������ display() �޼ҵ��Դϴ�."); }
}

class ChildOr extends ParentOr {
    void display() { System.out.println("�ڽ� Ŭ������ display() �޼ҵ��Դϴ�."); }
}

/*
 * �����ε��� �������̵�
 * �����ε�(overloading) : ���ο� �޼ҵ带 ����
 * �������̵�(overriding) : ��ӹ��� ������ �޼ҵ带 ������
 */

class ParentOrOl {
    void display() { System.out.println("�θ� Ŭ������ display() �޼ҵ��Դϴ�."); }
}

class ChildOrOl extends ParentOrOl {
    // �������̵��� display() �޼ҵ�
    void display() { System.out.println("�ڽ� Ŭ������ display() �޼ҵ��Դϴ�."); }
    
    // �����ε��� display() �޼ҵ�
    void display(String str) { System.out.println(str); } 
}

public class Overloading_Overriding {
    public static void main(String[] args) {
        ParentOr pa = new ParentOr();
        pa.display();
        
        ChildOr ch = new ChildOr();
        ch.display();
        
        ParentOr pc = new ChildOr(); // ������(polymorphism) ������ ����
        pc.display();
        // Child cp = new Parent();
        
        System.out.println("-----");
        
        ChildOrOl chorol = new ChildOrOl();
        chorol.display();
        chorol.display("�����ε��� display() �޼ҵ��Դϴ�.");
    }
}
