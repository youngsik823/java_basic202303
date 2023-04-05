package day08.poly;

class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class Basic {
    // 자식 객체는 상속관계에 있는 상위타입을 사용할 수 있다.    // 파일명과 퍼블릭 클래스의 이름이 같아야 한다.
    // 다형성은 자식 객체가 부모의 타입을 사용할수있다.
   Object x1 = new A();
   A x2 = new B();
   A x3 = new C();
   A x4 = new D();
   A x5 = new E();

   void test() {
       int a = 10;
       double b = a;

       B x = new B();
       A z = x; // A(부모) > B(자식)
       // 다형성은 다양한 형태로 타입을 변환시켜준다.
   }
}
