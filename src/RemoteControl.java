public interface RemoteControl {
//    인터페이스의 멤버는 상수(final), 정적 멤버 메서드, 추상 메서드, 디폴트 메서드만 사용 가능
//    인터페이스에서 사용할 수 있는 멤버는 일반 멤버 변수와 메서드는 불가능하기 때문에 static 및 abstract 생략할 수 있음.
//    정적 메서드 및 디폴트 메서드는 자바 버전 8부터 사용이 가능해짐
//    인터페이스는 객체생성이 불가능하기 때문에 반드시 자식 클래스에 상속을 받아서 사용해야 함. (변수생성은 가능)
//    구현 키워드를 implements 를 사용함.

//    상수 (final 생략)
//      1. 인터페이스는 상수 필드만 선언 가능
//      2. 상수명은 대문자로 작성. 단어구분은 '_' 로 함
//      3. 선언과 동시에 초기값 지정해야 함
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

//    추상 메서드(abstract 생략)
//      1. 실행부분 생략
    void turnOn();
    void turnOff();
    void setVolume(int volume);

//    디폴트 메서드
//      1. 자바8에서 추가됨
//      2. default 키워드 반드시 붙여야함.
//      3. 기본적으로  public 접근제한자로 지정
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        }
        else {
            System.out.println("무음 해제합니다.");
        }
    }

//    정적 메서드
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
