package org.zoo;

public class ZooDemo {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[3];
        zoo[0] = new Lion("Simba");
        zoo[1] = new Monkey("George");
        zoo[2] = new Elephant("Dumbo");

        int count = 3;
        for (Animal animal : zoo) {
            System.out.println(animal.getName());
            System.out.println("animal.makeSound("+count+")");
            animal.makeSound(count);
            System.out.println("animal.makeSound();");
            animal.makeSound();
        }

    }
}
