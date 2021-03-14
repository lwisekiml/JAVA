/*
# �������� ����
# ���μ���(process)��? �ܼ��� ���� ���� ���α׷�(program)�̶�� �� �� ����
(����ڰ� �ۼ��� ���α׷��� �ü���� ���� �޸� ������ �Ҵ�޾� ���� ���� ���� ����)
���μ����� ���α׷��� ���Ǵ� �����Ϳ� �޸� ���� �ڿ� �׸��� ������� ����

# ������(thread)��?
���μ���(process) ������ ������ �۾��� �����ϴ� ��ü�� �ǹ�
��� ���μ������� �� �� �̻��� �����尡 �����Ͽ� �۾��� ������
�� �� �̻��� �����带 ������ ���μ����� ��Ƽ������ ���μ���(multi-threaded process)��� ��

# �������� ������ ����
�����带 �����ϴ� ������� ������ ���� �� ���� ����� ����
1. Runnable �������̽��� �����ϴ� ���
2. Thread Ŭ������ ��ӹ޴� ���

�� ��� ��� �����带 ���� �۾��ϰ� ���� ������ run() �޼ҵ忡 �ۼ��ϸ� ��
���� �� ���� ����� ����Ͽ� �����带 �����ϰ� �����ϴ� ����

�� ������ ���� ����� ���캸��, ������ �����尡 ���� �����ư��� ����ǰ� �ִ� ���� Ȯ���� �� ����
Thread Ŭ������ ��ӹ����� �ٸ� Ŭ������ ��ӹ��� �� �����Ƿ�, �Ϲ������� Runnable �������̽��� �����ϴ� ������� �����带 ����
Runnable �������̽��� ��ü�� ���� �޼ҵ��� run() �޼ҵ� �� �ϳ����� ������ ������ �������̽�
*/
class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // ���� ���� ���� �������� �̸��� ��ȯ��.
            try {
                Thread.sleep(10);          // 0.01�ʰ� �����带 ����.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // ���� ���� ���� �������� �̸��� ��ȯ��.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 
public class ThreadTest {
    public static void main(String[] args){
        ThreadWithClass thread1 = new ThreadWithClass();       // Thread Ŭ������ ��ӹ޴� ���
        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable �������̽��� �����ϴ� ���
 
        thread1.start(); // �������� ����
        thread2.start(); // �������� ����
    }
}