/*
������(polymorphism) : �ϳ��� ��ü�� ���� ���� Ÿ���� ���� �� �ִ� ���� �ǹ�
�θ� Ŭ���� Ÿ���� ���� ������ �ڽ� Ŭ���� Ÿ���� �ν��Ͻ��� ������ �� �ֵ��� �Ͽ� �����ϰ� ����

�������� ���, �߻�ȭ�� ���Ҿ� ��ü ���� ���α׷����� �����ϴ� �߿��� Ư¡ �� �ϳ�

1. ���� ������ ������
�ڹٿ����� �������� ���� �θ� Ŭ���� Ÿ���� ���� ������ �ڽ� Ŭ���� Ÿ���� �ν��Ͻ��� ������ �� �ֵ��� �ϰ� ����
�̶� ���� ������ ����� �� �ִ� ����� ������ ���� �ν��Ͻ��� ��� �������� ���ų� ����� ������ �� �ֽ��ϴ�.
*/

class Parent { ... }
class Child extends Parent { ... }

Parent pa = new Parent(); // ���
Child ch = new Child();   // ���

// �θ� Ŭ���� Ÿ���� ���� ������ �ڽ� Ŭ���� Ÿ���� �ν��Ͻ� ���� ����
// ���� ������ ����� �� �ִ� ����� ������ ���� �ν��Ͻ��� ��� �������� ���� ����
Parent pc = new Child();  // ���

// �ڽ� Ŭ���� Ÿ���� ���� ������ �θ� Ŭ���� Ÿ���� �ν��Ͻ��� ����X
// ���� ������ ����� �� �ִ� ����� ������ ���� �ν��Ͻ��� ��� �������� ���� ����
Child cp = new Parent();  // ���� �߻�.

//Ŭ������ ����� ���� Ȯ��� ���� �־ ��ҵ� ���� �����Ƿ�, �ڽ� Ŭ�������� ����� �� �ִ� ����� ������ ������ �θ� Ŭ������ ���ų� ���� ��


/*
���� ������ Ÿ�� ��ȯ
���� ������ ������ ���� ���ǿ� ���� Ÿ�� ��ȯ ����

1. ���� ��� ���迡 �ִ� Ŭ���� ���̿��� Ÿ�� ��ȯ ����
2. �ڽ� Ŭ���� Ÿ�Կ��� �θ� Ŭ���� Ÿ�������� Ÿ�� ��ȯ�� ���� ����
3. ������ �θ� Ŭ���� Ÿ�Կ��� �ڽ� Ŭ���� Ÿ�������� Ÿ�� ��ȯ�� �ݵ�� ���
*/

class Parent { ... }
class Child extends Parent { ... }
class Brother extends Parent { ... }

Parent pa01 = null;
Child ch = new Child();
Parent pa02 = new Parent();
Brother br = null;

pa01 = ch;          // pa01 = (Parent)ch; �� ������, Ÿ�� ��ȯ�� ������ �� ����.
br = (Brother)pa02; // Ÿ�� ��ȯ�� ������ �� ����.
br = (Brother)ch;   // �������� ��� ���谡 �ƴϹǷ�, ���� �߻�.


/* 02/08
instanceof ������
instanceof �����ڸ� ����Ͽ�, ���� ������ �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� Ȯ���� �� �ֵ��� ��

(����)
�������� instanceof Ŭ�����̸�(Ŭ����Ÿ��)

���������� ������ �����ϰ� �ִ� �ν��Ͻ��� Ÿ���� Ŭ�����̸�(Ŭ����Ÿ��)�̸� true, �ƴϸ� false
���� ������ null�� ����Ű�� ������ false ��ȯ
*/

class Parent { }
class Child extends Parent { }
class Brother extends Parent { }

public class Polymorphism {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p instanceof Object); // true
        System.out.println(p instanceof Parent); // true
        System.out.println(p instanceof Child);  // false
        System.out.println();
 
        Parent c = new Child();
        System.out.println(c instanceof Object); // true
        System.out.println(c instanceof Parent); // true
        System.out.println(c instanceof Child);  // true
    }
}
