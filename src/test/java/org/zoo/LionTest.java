package org.zoo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {
    Lion lion;
    @BeforeEach
    void setUp() {
        lion = new Lion("Simba");
    }

    @AfterEach
    void tearDown() {
        lion = null;
        System.gc();
        System.setOut(System.out);
    }

    @Test
    void getNameTest(){
        Assertions.assertEquals("Simba", lion.getName());
    }

    @Test
    void makeSoundTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        lion.makeSound();
        assertEquals("Lion sound: roar\n",outputStream.toString());
    }

    @Test
    void MakeSoundCounterTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        lion.makeSound(3);
        String output = outputStream.toString();
        String[] lines = output.split(System.lineSeparator()); // capture multi line output
        assertTrue(lines[0].contains("Lion sound: roar"), "Expected Lion sound: roar");
        assertTrue(lines[1].contains("Lion sound: roar"), "Expected Lion sound: roar");
        assertTrue(lines[2].contains("Lion sound: roar"), "Expected Lion sound: roar");
    }

    @Test
    void makeSoundCounterNegativeInputTest() {
        assertThrows(IllegalArgumentException.class, () -> lion.makeSound(-1));
    }

    @Test
    void makeSoundCounterOverflowedInputTest() {
        assertThrows(IllegalArgumentException.class, () -> lion.makeSound(Integer.MAX_VALUE +1));
    }

    @Test
    void nullConstructorTest() {
        assertThrows(NullPointerException.class, () -> new Lion(null));
    }
}