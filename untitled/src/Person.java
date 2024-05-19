public class Person {
    String name;
    String address;
    boolean isVip;
    static int count = 0;

    public void printName() {
        System.out.println("내 이름은 " + name);
    }

    public static void printCount() {
        // static한 메소드에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다.
        System.out.println("count " + count);
    }

}
