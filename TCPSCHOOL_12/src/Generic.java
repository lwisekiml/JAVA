/*
# ���׸��� ����
���׸�(generic)�̶�?
�������� Ÿ��(data type)�� �Ϲ�ȭ�Ѵ�(generalize)�� ���� �ǹ�
Ŭ������ �޼ҵ忡�� ����� ���� ������ Ÿ���� ������ �ÿ� �̸� �����ϴ� ���
������ �ÿ� �̸� Ÿ�� �˻�(type check)�� �����ϸ� ������ ���� ������ ����

1. Ŭ������ �޼ҵ� ���ο��� ���Ǵ� ��ü�� Ÿ�� �������� ���� �� ����
2. ��ȯ���� ���� Ÿ�� ��ȯ �� Ÿ�� �˻翡 ���� ����� ���� �� ����

JDK 1.5 ���������� ���� Ÿ���� ����ϴ� ��κ��� Ŭ������ �޼ҵ忡�� �μ��� ��ȯ������ Object Ÿ���� ���
�� ��쿡�� ��ȯ�� Object ��ü�� �ٽ� ���ϴ� Ÿ������ Ÿ�� ��ȯ�ؾ� �ϸ�, �̶� ������ �߻��� ���ɼ� ����
JDK 1.5���� ���Ե� ���׸��� ����ϸ� ������ �ÿ� �̸� Ÿ���� �������Ƿ�, Ÿ�� �˻糪 Ÿ�� ��ȯ�� ���� ���ŷο� �۾��� ���� ����

# ���׸��� ���� �� ����
Ŭ������ �޼ҵ忡�� ������ ���� ������� ���� ����

class MyArray<T> {
    T element;
    void setElement(T element) { this.element = element; }
    T getElement() { return element; }
}

���� �������� ���� 'T'�� Ÿ�� ����(type variable)��� �ϸ�, ������ ������ Ÿ���� �ǹ�
�� 'T'�Ӹ� �ƴ϶� ��� ���ڸ� ����ص� ���������, ���� ���� Ÿ�� ������ ��ǥ(,)�� �����Ͽ� ����� �� ����
Ÿ�� ������ Ŭ���������Ӹ� �ƴ϶� �޼ҵ��� �Ű������� ��ȯ�����ε� ����� �� ����

���� ���� ����� ���׸� Ŭ����(generic class)�� ������ ������ Ÿ�� ���� �ڸ��� ����� ���� Ÿ���� ����ؾ� ��
MyArray<Integer> myArr = new MyArray<Integer>();

���� ������ MyArray Ŭ������ ���� Ÿ�� ������ Integer Ÿ���� ����ϴ� ����
��ó�� ���׸� Ŭ������ ������ �� ����� ���� Ÿ���� ����ϸ�, ���������δ� ���ǵ� Ÿ�� ������ ��õ� ���� Ÿ������ ��ȯ�Ǿ� ó��

�ڹٿ��� Ÿ�� ���� �ڸ��� ����� ���� Ÿ���� ����� �� �⺻ Ÿ���� �ٷ� ����� ���� ����
�� ������ Integer�� ���� ����(wrapper) Ŭ������ ����ؾ�  ��

Java SE 7���� �ν��Ͻ� ���� �� Ÿ���� ������ �� �ִ� ��쿡�� Ÿ���� ������ �� ����
MyArray<Integer> myArr = new MyArray<>(); // Java SE 7���� ������.
 

���׸����� ����Ǵ� Ÿ�� ������ �������� �����ִ� ����
*/
import java.util.*;

class LandAnimal { public void crying() { System.out.println("��������"); } }
class Cat extends LandAnimal { public void crying() { System.out.println("�Ŀ˳Ŀ�"); } }
class Dog extends LandAnimal { public void crying() { System.out.println("�۸�"); } }
class Sparrow { public void crying() { System.out.println("±±"); } }

class AnimalList<T> {
    ArrayList<T> al = new ArrayList<T>();

    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}

public class Generic {
    public static void main(String[] args) {
        AnimalList<LandAnimal> landAnimal = new AnimalList<>(); // Java SE 7���� ����������.

        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat());
        landAnimal.add(new Dog());
        // landAnimal.add(new Sparrow()); // ������ �߻���.

        for (int i = 0; i < landAnimal.size() ; i++) {
            landAnimal.get(i).crying();
        }
    }
}

/*
���� �������� Cat�� Dog Ŭ������ LandAnimal Ŭ������ ��ӹ޴� �ڽ� Ŭ�����̹Ƿ�,
AnimalList<LandAnimal>�� �߰��� �� ������ Sparrow Ŭ������ Ÿ���� �ٸ��Ƿ� �߰��� �� ����

# ���׸��� ���� �ñ�
������ �� �����Ϸ��� ���� �ڵ����� �˻�Ǿ� Ÿ�� ��ȯ ��
�ڵ� ���� ��� ���׸� Ÿ���� ���ŵǾ�, �����ϵ� class ���Ͽ��� ��� ���׸� Ÿ�Ե� ���Ե��� �ʰ� ��
�̷� ������ �����ϴ� ������ ���׸��� ������� �ʴ� �ڵ���� ȣȯ���� �����ϱ� ����
*/