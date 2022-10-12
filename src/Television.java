public class Television implements RemoteControl{
//    인터페이스를 구현할 때 인터페이스의 모든 추상 메서드를 재정의 해야 함.
//    일부만 재정의할 경우, 추상 클래스로 선언하고 abstract 키워드 붙여야 함
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else  {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
}
