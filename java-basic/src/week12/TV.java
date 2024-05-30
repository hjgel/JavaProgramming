package week12;

public class TV implements RemoteControl{
    // TV 클래스는 RemoteControl 인터페이스를 구현하는 구현클래스
    private int volume;
    private int memoryVol; // 현재 볼륨 저장

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
        if (volume > RemoteControl.MAX_VOLUME) volume = RemoteControl.MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME) volume = RemoteControl.MIN_VOLUME;

        this.volume = volume;
        System.out.println("현재 TV 볼륨 : " + volume);
    }

    @Override
    public void setMute(boolean mute) {
        // default 메소드는 구현 클래스에서 재정의해서 사용 가능
        if(mute) {
            this.memoryVol = this.volume;
            System.out.println("TV 무음 처리");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("TV 무음 해제");
            setVolume(memoryVol);
        }
    }
}
