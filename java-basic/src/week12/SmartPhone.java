package week12;

public class SmartPhone {
    EarPhone earPhone;

    public void musicOn(EarPhone ep){
        ep.play();
    }
    public void musicOff(EarPhone ep){
        ep.stop();
    }
}
