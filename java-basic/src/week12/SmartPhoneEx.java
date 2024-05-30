package week12;

import java.util.Scanner;

public class SmartPhoneEx {
    public static void main(String[] args) {
        System.out.println("*** 스마트폰으로 음악 재생하기 ***");
        Scanner sc = new Scanner(System.in);
        int menu;

        SmartPhone sp = new SmartPhone();
        EarPhone   ep = null;

        while (true) {
            System.out.print("\n이어폰 선택(1.Buds 2.AirPods 3.TonFree 4.종료) >> ");
            menu = sc.nextInt();

            if (menu == 4) break;
            ep = switch (menu) {
                case 1 -> new Buds();
                case 2 -> new AirPods();
                case 3 -> new TonFree();
                default -> ep;
            };
            sp.musicOn(ep);
            sp.musicOff(ep);
        }
        System.out.println("프로그램");
        sc.close();
    }
}
