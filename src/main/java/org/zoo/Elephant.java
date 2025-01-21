package org.zoo;

public class Elephant extends Animal {
    Elephant(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("elephant sound: ppffff");
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
