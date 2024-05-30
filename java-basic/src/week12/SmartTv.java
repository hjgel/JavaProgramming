package week12;

public class SmartTv implements RemoteControl, Searchable {
    private int volume;
    private int memoryVol;
    @Override
    public void turnOn() {
        System.out.println("Smart TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Smart TV 현재 볼륨 : " + volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
    @Override
    public void setMute(boolean mute) {
        // default 메소드는 구현 클래스에서 재정의해서 사용 가능
        if(mute) {
            this.memoryVol = this.volume;
            System.out.println("TV 무음 처리");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("TV 무음 해제");
            setVolume(memoryVol);
        }
    }
}
