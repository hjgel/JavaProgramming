package ref;

public class MethodChange {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("매서드 호출 전 : a = " + a);
        changeReference(a);
        System.out.println("메서드 호출 후 : a = " + a);

    }
    public static void changeReference(int a) {
        a = 20;
    }
}
