package b.oop.practice;

public class Dog {

    // 문제 2: Dog 클래스 만들기
    //견종(breed), 이름(name)을 속성으로 가지고, "앉아"(sit()), "손"(hand()) 기능을 가진 Dog 클래스를 구현하세요.
    String name;
    String breed;

    public Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void sit() {
        System.out.println(breed + " " + name + "가 앉았습니다.");
    }
    void hand() {
        System.out.println(breed + " " + name + "가 손을 내밀었습니다.");
    }
}
