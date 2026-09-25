class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
    void fly(){
        System.out.println("flyed");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    
}
class Cat extends Animal {
    void sound(){
        System.out.println("Cat sits");
    }
}
class runtimepoly {
    public static void main(String[] args) {
        Animal a = new Cat();
        Cat c=new Cat();
        Dog d = new Dog();
        a.fly();
        d.sound();
        c.sound();
        a.sound();
    }
}