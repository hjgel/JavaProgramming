public class Hello2 {
    static int i;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println("Hello world!");
    }
    static {
        i = 500;
        System.out.println("static block"); // 원래는 static field를 초기화한다.
    }
}

// 컴파일
// javac Hello2.java
// java Hello2