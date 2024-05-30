package week12;

public class RemoteControlEx {
    public static void main(String[] args) {
        // 구현 클래스를 이용한 객체 생성
        TV tv = new TV();
        Audio audio = new Audio();

        // 생성된 객체를 이용한 메소드 호출
        tv.turnOn();
        tv.setVolume(5);
        tv.setMute(true);
        tv.setMute(false);
        tv.turnOff();

        System.out.println("-------------");

        audio.turnOn();
        audio.setVolume(10);
        audio.setMute(false);
        audio.turnOff();

//        System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
//        System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VOLUME);

        RemoteControl.changeBattery();

        // 익명 구현 객체 만들기
        System.out.println("----------");
        System.out.println("** 구현 클래스 없이 직접 구현객체 생성 **");

        RemoteControl rc = new RemoteControl() {
            private int volume;
            @Override
            public void turnOn() {
                System.out.println("익명 객체 전원을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("익명 객체 전원을 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                this.volume = volume;
            }
        };

        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.turnOff();

        System.out.println("--------------");
        SmartTv smart = new SmartTv();
        smart.turnOn();
        smart.setVolume(10);
        smart.search("네이버");
        smart.setMute(true);
        smart.setMute(false);
        smart.turnOff();

        System.out.println("--------------------");
        System.out.println("-- << 다형성 결과 >> --");

        // 인터페이스 변수에 들어갈 수 있는 객체 => 구현 객체
        RemoteControl[] rc2 = new RemoteControl[3];
        rc2[0] = tv;
        rc2[1] = audio;
        rc2[2] = smart;

        for (RemoteControl r : rc2) {
            r.turnOn();
            r.setVolume(5);
            r.setMute(true);
            r.setMute(false);
            r.turnOff();
            System.out.println("-----");
        }
    }
}
