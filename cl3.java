class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class cl3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        Animal a = new Animal();
        a.makeSound();
    }
}