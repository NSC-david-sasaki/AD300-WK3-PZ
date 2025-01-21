package org.zoo;

public abstract class Animal {
    private String name;
    Animal(String name) {
        if (!(name == null || name.isEmpty())) {
            this.name = name;
        }
        else throw new NullPointerException("Name cannot be null or empty");
    }

    abstract void makeSound();

    abstract void makeSound(int count);

    public String getName() {
        return name;
    }
}
