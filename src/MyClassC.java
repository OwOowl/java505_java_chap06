public class MyClassC implements MyIntercace2{
//    MyInterface 에서 상속해준 추상메서드
    @Override
    public void method1() {
        System.out.println("MyClassC의 method1() 실행");
    }

//    MyInterface 에서 디폴트메서드로 상속해 줬으나 MyInterface2에서 추상메서드로 오버라이딩한 메서드
//    MyInterface2를 구현하는 구현체는 반드시 해당 메서드를 구현해야함
    @Override
    public void method2() {
        System.out.println("MyClassC의 method2() 실행");
    }

//    MyInterface2 전용으로 생성한 추상메서드
    @Override
    public void method3() {
        System.out.println("MyClassC의 method3() 실행");
    }
}
