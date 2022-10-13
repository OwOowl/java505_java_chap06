public interface MyInterface {
    void method1();

    //    기존에 구현되던 클래스를 새롭게 업데이트 할 필요없이 그대로 사용 가능.
//    해당 interface를 구현하는 구현체가 여러개 존재할 경우에 구현체의 수정없이 기능을 추가하고자 하는 경우 default 메서드 사용
    default void method2() {
        System.out.println("dMyInterface의 method2() 실행");
    };
}
