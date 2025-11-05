package b.oop.practice;

public class Main {
    public static void main(String[] args) {

        // 문제 1
        Person person = new Person("홍길동", 25);
        person.printInfo();

        // 문제 2
        Dog dog = new Dog("백구", "진돗개");
        dog.sit();
        dog.hand();

        // 문제 3
        Car car = new Car("Avante", 0);
        car.accelerate();  // 속도 10
        car.accelerate();  // 속도 20
        car.accelerate();  // 속도 30
        car.brake();       // 속도 20
        car.printInfo();   // 모델: Avante, 속도: 20km/h

        // 문제 4
        BankAccount bank = new BankAccount("3", 0);
        bank.deposit(10000);
        bank.withdraw(3000);

        // 문제 5
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.count);
    }
}
