/*
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

public class Super {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.display();
    }
}