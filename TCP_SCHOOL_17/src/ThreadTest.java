/*
# 스레드의 개념
# 프로세스(process)란? 단순히 실행 중인 프로그램(program)이라고 할 수 있음
(사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행 중인 것을 말함)
프로세스는 프로그램에 사용되는 데이터와 메모리 등의 자원 그리고 스레드로 구성

# 스레드(thread)란?
프로세스(process) 내에서 실제로 작업을 수행하는 주체를 의미
모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행함
두 개 이상의 스레드를 가지는 프로세스를 멀티스레드 프로세스(multi-threaded process)라고 함

# 스레드의 생성과 실행
스레드를 생성하는 방법에는 다음과 같이 두 가지 방법이 있음
1. Runnable 인터페이스를 구현하는 방법
2. Thread 클래스를 상속받는 방법

두 방법 모두 스레드를 통해 작업하고 싶은 내용을 run() 메소드에 작성하면 됨
위의 두 가지 방법을 사용하여 스레드를 생성하고 실행하는 예제

위 예제의 실행 결과를 살펴보면, 생성된 스레드가 서로 번갈아가며 실행되고 있는 것을 확인할 수 있음
Thread 클래스를 상속받으면 다른 클래스를 상속받을 수 없으므로, 일반적으로 Runnable 인터페이스를 구현하는 방법으로 스레드를 생성
Runnable 인터페이스는 몸체가 없는 메소드인 run() 메소드 단 하나만을 가지는 간단한 인터페이스
*/
class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);          // 0.01초간 스레드를 멈춤.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 실행 중인 스레드의 이름을 반환함.
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
        ThreadWithClass thread1 = new ThreadWithClass();       // Thread 클래스를 상속받는 방법
        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable 인터페이스를 구현하는 방법
 
        thread1.start(); // 스레드의 실행
        thread2.start(); // 스레드의 실행
    }
}