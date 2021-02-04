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

class ParentOR {
    void display() { System.out.println("�θ� Ŭ������ display() �޼ҵ��Դϴ�."); }
}

class ChildOR extends ParentOR {
    void display() { System.out.println("�ڽ� Ŭ������ display() �޼ҵ��Դϴ�."); }
}

public class Overloading_Overriding {
    public static void main(String[] args) {
        ParentOR pa = new ParentOR();
        pa.display();
        
        ChildOR ch = new ChildOR();
        ch.display();
        
        ParentOR pc = new ChildOR(); // ������(polymorphism) ������ ����
        pc.display();
        // Child cp = new Parent();        
    }
}
