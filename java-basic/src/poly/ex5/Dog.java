package poly.ex5;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("훈발훈발");
    }

    @Override
    public void move() {
        System.out.println("훈발놈이 걸어다닙니다.");
    }
}
