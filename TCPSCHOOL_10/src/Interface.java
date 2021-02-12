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

// 2/12 Ŭ������ �̿��� ���� ����� ������
// �޼ҵ� ��ó�� ��ȣ�� ���� ���� �߻� ���� 

class Animal3 { 
    public void cry() {
        System.out.println("¢��!");
    }
}

class Cat3 extends Animal3 {
    public void cry() {
        System.out.println("�Ŀ˳Ŀ�!");
    }
}

class Dog3 extends Animal3 {
    public void cry() {
        System.out.println("�۸�!");
    }
}

class MyPet3 extends Cat3, Dog3 {} // ��
 
/*
Cat Ŭ������ Dog Ŭ������ ���� Animal Ŭ������ ��ӹ޾� cry() �޼ҵ带 �������̵� ��
MyPet Ŭ������ Cat Ŭ������ Dog Ŭ������ ���ÿ� ��ӹް� �Ǹ� ���� �߻�

������� MyPet �ν��Ͻ��� p�� cry() �޼ҵ带 ȣ���ϸ�
Cat Ŭ�������� ��ӹ��� cry() �޼ҵ����� Dog Ŭ�������� ��ӹ��� cry() �޼ҵ������� ������ �� ���� ��ȣ���� ����
�̿� ���� ������ �ڹٿ����� Ŭ������ �̿��� ���� ����� ����X

������ ���� ����ó�� �������̽��� �̿��Ͽ� ���� ����� �ϰԵǸ�, ���� ���� �޼ҵ� ȣ���� ��ȣ���� ������ �� ����
*/

interface Animal4 { public abstract void cry(); }
interface Cat4 extends Animal4 { public abstract void cry(); }
interface Dog4 extends Animal4 { public abstract void cry(); }

class MyPet4 implements Cat4, Dog4 {
    public void cry() {
        System.out.println("�۸�! �Ŀ˳Ŀ�!");
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
        
        System.out.println("--------");
        
        MyPet3 p3 = new MyPet3();
        p3.cry(); // ��
        
        System.out.println("--------");
        
        MyPet4 p4 = new MyPet4();
        p4.cry();
    }
}

/*
Cat �������̽��� Dog �������̽��� ���ÿ� ������ MyPet Ŭ���������� cry() �޼ҵ带 �����ϹǷ�, �ռ� �������� �߻��� �޼ҵ� ȣ���� ��ȣ�� ����

�������̽��� ����
���� ����� ������ �Ӹ� �ƴ϶�
1. ��Ը� ������Ʈ ���� �� �ϰ��ǰ� ����ȭ�� ������ ���� ǥ��ȭ ����
2. Ŭ������ �ۼ��� �������̽��� ������ ���ÿ� ������ �� �����Ƿ�, ���� �ð� ���� ����
3. Ŭ������ Ŭ���� ���� ���踦 �������̽��� �����ϸ�, Ŭ�������� �������� ���α׷����� ����
*/