/*
�ڽ� Ŭ������ ���� �θ� Ŭ������ ��ӹ��� �� �ִٸ�, �پ��� ������ ������ �� �ִٴ� ������ ������ ��
������ Ŭ������ �̿��Ͽ� ���� ����� �� ��� �޼ҵ� ��ó�� ��ȣ�� �� ���� ���� ���� �߻� ���� -> Ŭ������ ���� ���� ����� ����X

- �������̽�(interface)��?
�ٸ� Ŭ������ �ۼ��� �� �⺻�� �Ǵ� Ʋ�� �����ϸ鼭, �ٸ� Ŭ���� ������ �߰� �Ű� ���ұ��� ����ϴ� ������ �߻� Ŭ������ �ǹ�

�߻� Ŭ������ �߻� �޼ҵ�Ӹ� �ƴ϶� ������, �ʵ�, �Ϲ� �޼ҵ嵵 ���� ����
�������̽�(interface)�� ������ �߻� �޼ҵ�� ������� ���� ����

- �������̽��� ����
���� �����ڿ� �Բ� interface Ű���带 ��� 

����
���������� interface �������̽��̸� {
    public static final Ÿ�� ����̸� = ��;
    ...
    public abstract �޼ҵ��̸�(�Ű��������);
    ...
}

��, Ŭ�����ʹ� �޸� �������̽��� ��� �ʵ�� public static final�̾�� �ϸ�, ��� �޼ҵ�� public abstract�̾�� ��
��� �������̽��� �������� ����Ǵ� �κ��̹Ƿ� �� �����ڴ� ���� ����

������ �����ڴ� ������ �� �ڹ� �����Ϸ��� �ڵ����� �߰� ��

- �������̽��� ����
�������̽��� �߻� Ŭ������ ���������� �ڽ��� ���� �ν��Ͻ��� ����X
���� �������̽��� �����ϰ� �ִ� �߻� �޼ҵ带 ������ �� Ŭ������ �ۼ��ؾ߸� �մϴ�.

����
class Ŭ�����̸� implements �������̽��̸� { ... }

���� ��� �߻� �޼ҵ带 �������� �ʴ´ٸ�, abstract Ű���带 ����Ͽ� �߻� Ŭ������ �����ؾ� �մϴ�.
*/
interface Animal1 { public abstract void cry(); }

class Cat1 implements Animal1 {
	public void cry() {
        System.out.println("�Ŀ˳Ŀ�!");
    }
}

class Dog1 implements Animal1 {
    public void cry() {
        System.out.println("�۸�!");
    }
}

// 2/11 ���߻��
// �������̽��� �������̽��κ��͸� ����� ���� �� ������, ���� �������̽��� ��ӹ��� �� ����
interface Animal2 { public abstract void cry(); }
interface Pet2 { public abstract void play(); }

class Cat2 implements Animal2, Pet2 {
    public void cry() {
        System.out.println("�Ŀ˳Ŀ�!");
    }
    public void play() {
        System.out.println("�� ��� ��������~!");
    }
}

class Dog2 implements Animal2, Pet2 {
    public void cry() {
        System.out.println("�۸�!");
    }
    public void play() {
        System.out.println("��å����~!");
    }
}

public class Interface {
    public static void main(String[] args) {
    	Cat1 c1 = new Cat1();
        Dog1 d1 = new Dog1();
 
        c1.cry();
        d1.cry();
        
        System.out.println("--------");
    	
        Cat2 c2 = new Cat2();
        Dog2 d2 = new Dog2();

        c2.cry();
        c2.play();
        d2.cry();
        d2.play();
    }
}

