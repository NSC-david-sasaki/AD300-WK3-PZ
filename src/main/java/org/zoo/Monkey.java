package org.zoo;

public class Monkey extends Animal {
    Monkey(String name){
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Monkey makes sound: ooh ooh ah ah");
    }

    @Override
    void makeSound(int count) {
        if((count>0)&& (count < Integer.MAX_VALUE)){
            while (count >0){
                this.makeSound();
                count--;
            }
        }
    }
}
