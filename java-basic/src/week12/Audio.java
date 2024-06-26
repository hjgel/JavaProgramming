package week12;

public class Audio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) volume = RemoteControl.MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME) volume = RemoteControl.MIN_VOLUME;

        this.volume = volume;
        System.out.println("현재 Audio 볼륨 : " + volume);
    }
}
