package d.inheritance.practice02;

class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("sound");
    }
}

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("어흥!");
    }
}

class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("뿌우우!");
    }
}

class Monkey extends Animal {
    @Override
    void makeSound() {
        System.out.println("끼끼!");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion(),
                new Elephant(),
                new Monkey()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    class Zoo {
        void makeSound(Animal animal) {
            animal.makeSound();
        }
    }
}
