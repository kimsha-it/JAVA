package b.oop.practice;

public class Car {

    // 문제 3: Car 클래스
    // 다음 요구사항에 맞는 Car 클래스를 구현하세요.

    // 속성:
    // 모델명(model)
    // 속도(speed)

    // 기능:
    // accelerate(): 속도 10 증가
    // brake(): 속도 10 감소
    // printInfo(): 모델명과 현재 속도 출력

    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void accelerate() {
        speed += 10;
    }
    void brake() {
        speed -= 10;
    }
    void printInfo() {
        System.out.println(model);
        System.out.println(speed + "km/h");
    }
}
