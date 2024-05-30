package week12;

public interface RemoteControl {
    // 인터페이스는 객체를 사용하는 방법을 정의 => 객체 사용 설명서

    // 인터페이스에서 선언 가능한 필드는 상수 필드 뿐이다.
    // 상수를 선언할 때는 반드시 초기값을 설정해야 한다.
    // static final을 생략해도 컴파일하는 과정에서 자동으로 생성
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 인터페이스에 선언된 메소드는 실행문이 없는 추상 메소드
    // abstract를 생략해도 컴파일 과정에서 자동으로 생성
    // 최종적으로 구현 클래스에서 재정의해서 사용
    public void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME); // 추상메소드 호출
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    // static 메소드 => 인터페이스 이름으로 직접 호출 가능
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
