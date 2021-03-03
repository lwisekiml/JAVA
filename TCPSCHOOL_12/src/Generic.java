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

class AnimalList1<T> {
    ArrayList<T> al = new ArrayList<T>();

    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}

// # �پ��� ���׸� ǥ��
class AnimalList2<T extends LandAnimal> {
    ArrayList<T> al = new ArrayList<T>();

    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }

}

// # ���ϵ�ī���� ���
class AnimalList3<T> {
    ArrayList<T> al = new ArrayList<T>();

    public static void cryingAnimalList(AnimalList3<? extends LandAnimal> al) {
        LandAnimal la = al.get(0);
        la.crying();
    }

    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}


public class Generic {
    public static void main(String[] args) {
    	System.out.println("--- Generic 1 ---");
        AnimalList1<LandAnimal> landAnimal1 = new AnimalList1<>(); // Java SE 7���� ����������.

        landAnimal1.add(new LandAnimal());
        landAnimal1.add(new Cat());
        landAnimal1.add(new Dog());
        // landAnimal.add(new Sparrow()); // ������ �߻���.

        for (int i = 0; i < landAnimal1.size() ; i++) {
            landAnimal1.get(i).crying();
        }

/*
���� �������� Cat�� Dog Ŭ������ LandAnimal Ŭ������ ��ӹ޴� �ڽ� Ŭ�����̹Ƿ�,
AnimalList<LandAnimal>�� �߰��� �� ������ Sparrow Ŭ������ Ÿ���� �ٸ��Ƿ� �߰��� �� ����

# ���׸��� ���� �ñ�
������ �� �����Ϸ��� ���� �ڵ����� �˻�Ǿ� Ÿ�� ��ȯ ��
�ڵ� ���� ��� ���׸� Ÿ���� ���ŵǾ�, �����ϵ� class ���Ͽ��� ��� ���׸� Ÿ�Ե� ���Ե��� �ʰ� ��
�̷� ������ �����ϴ� ������ ���׸��� ������� �ʴ� �ڵ���� ȣȯ���� �����ϱ� ����
*/

        

/*
# �پ��� ���׸� ǥ��
# Ÿ�� ������ ����
'T'�� ���� Ÿ�� ����(type variable)�� ����Ͽ� Ÿ���� ����
extends Ű���带 ����ϸ� Ÿ�� ������ Ư�� Ÿ�Ը��� ����ϵ��� ������ �� ����

ex) class AnimalList<T extends LandAnimal> { ... }

Ŭ������ Ÿ�� ������ ������ �ɾ� ������ Ŭ���� ���ο��� ���� ��� Ÿ�� ������ ������ �ɸ�
�� �� Ŭ������ �ƴ� �������̽��� ������ ��쿡�� implements Ű���尡 �ƴ� extends Ű���带 ����ؾ� ��

ex)
interface WarmBlood { ... }
...
class AnimalList<T extends WarmBlood> { ... } // implements Ű���带 ����ؼ��� �ȵ�.

Ŭ������ �������̽��� ���ÿ� ��ӹް� �����ؾ� �Ѵٸ� '&' ��ȣ�� ���

ex) class AnimalList<T extends LandAnimal & WarmBlood> { ... }
*/
    	System.out.println("--- Generic 2 ---");

        AnimalList2<LandAnimal> landAnimal2 = new AnimalList2<>(); // Java SE 7���� ����������.

        landAnimal2.add(new LandAnimal());
        landAnimal2.add(new Cat());
        landAnimal2.add(new Dog());
        // landAnimal.add(new Sparrow()); // ������ �߻���.

        for (int i = 0; i < landAnimal2.size() ; i++) {
            landAnimal2.get(i).crying();
        }
/*
���� ������ Ÿ�� ������ �������� �̿��Ͽ� AnimalList Ŭ������ ����ο� ����� 'extends LandAnimal' ������ �����ص� ����� ���� ��
�ڵ��� ��Ȯ���� ���ؼ��� ���� ���� Ÿ���� ������ ����ϴ� ���� �� ����

# ���׸� �޼ҵ�(generic method)
�޼ҵ��� ����ο� Ÿ�� ������ ����� �޼ҵ带 �ǹ�
Ÿ�� ������ ������ �޼ҵ� ����ο��� ��ȯ Ÿ�� �ٷ� �տ� ��ġ ��

ex) public static <T> void sort( ... ) { ... }

���׸� Ŭ�������� ���ǵ� Ÿ�� ���� T�� ���׸� �޼ҵ忡�� ���� Ÿ�� ���� T�� ���� ������ ������ �����ؾ� ��
ex)
class AnimalList<T> {
    ...
    public static <T> void sort(List<T> list, Comparator<? super T> comp) {
        ...
    }
    ...
}

# ���ϵ�ī���� ���
�̸��� ������ ���� ������ ǥ���ϴ� �� ���Ǵ� ��ȣ�� �ǹ�
�ڹ��� ���׸������� ����ǥ(?) ��ȣ�� ����Ͽ� �̷��� ���ϵ�ī�带 ����� �� ����

����
<?>           // Ÿ�� ������ ��� Ÿ���� ����� �� ����.
<? extends T> // T Ÿ�԰� T Ÿ���� ��ӹ޴� �ڼ� Ŭ���� Ÿ�Ը��� ����� �� ����.
<? super T>   // T Ÿ�԰� T Ÿ���� ��ӹ��� ���� Ŭ���� Ÿ�Ը��� ����� �� ����.

���� ������ Ŭ���� �޼ҵ�(static method)�� cryingAnimalList() �޼ҵ��� �Ű������� Ÿ���� ���ϵ�ī�带 ����Ͽ� �����ϴ� �����Դϴ�.
*/
		System.out.println("--- Generic 3 ---");

        AnimalList3<Cat> catList3 = new AnimalList3<Cat>();
        catList3.add(new Cat());
        AnimalList3<Dog> dogList3 = new AnimalList3<Dog>();
        dogList3.add(new Dog());

        AnimalList3.cryingAnimalList(catList3);
        AnimalList3.cryingAnimalList(dogList3);
    }
}
