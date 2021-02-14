/*
2/14

Object 클래스

1. java.lang 패키지
자바에서 가장 기본적인 동작을 수행하는 클래스들의 집합
자바에서는 java.lang 패키지의 클래스들은 import 문을 사용하지 않아도 클래스 이름만으로 바로 사용 가능

2. java.lang.Object 클래스
java.lang 패키지 중에서도 가장 많이 사용되는 클래스는 바로 Object 클래스
Object 클래스는 모든 자바 클래스의 최고 조상 클래스
자바의 모든 클래스는 Object 클래스의 모든 메소드를 바로 사용 가능 

이러한 Object 클래스는 필드를 가지지 않으며, 총 11개의 메소드만으로 구성

3. toString() 메소드
해당 인스턴스에 대한 정보를 문자열로 반환
반환되는 문자열은 클래스 이름과 함께 구분자로 '@'가 사용되며, 그 뒤로 16진수 해시 코드(hash code)가 추가 됨
16진수 해시 코드 값은 인스턴스의 주소를 가리키는 값으로, 인스턴스마다 모두 다르게 반환 됨

예제
Car car01 = new Car();
Car car02 = new Car();

System.out.println(car01.toString());
System.out.println(car02.toString());

실행 결과
Car@15db9742
Car@6d06d69c

자바에서 toString() 메소드는 기본적으로 각 API 클래스마다 자체적으로 오버라이딩을 통해 재정의되어 있음
*/
public class Object {

}
