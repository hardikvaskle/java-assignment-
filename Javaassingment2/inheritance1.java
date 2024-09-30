package Javaassingment2;

class Animal {
    void eat(){
        System.out.println( "this animal is eat food ");
    }
}

class Mammal extends Animal {
    void breathe(){
System.out.println("mammal is breathe air ");
    }
}

class Dog extends Mammal {
    void bark (){
System.out.println("the dog is barking  ");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        Dog dog = new Dog ();
        dog.eat();
        dog.breathe();
        dog.bark();
    }
}
