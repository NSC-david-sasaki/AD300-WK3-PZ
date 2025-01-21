package org.zoo;

public class Lion extends Animal {
    Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Lion sound: roar");
    }

    @Override
    void makeSound(int count) throws IllegalArgumentException{
        if(count>0 && count < Integer.MAX_VALUE){
            while (count >0){
                this.makeSound();
                count--;
            }
        }
        else{
            throw new IllegalArgumentException("Lion count must be between 0 and Integer.MAX_VALUE");
            }
        }
    }


