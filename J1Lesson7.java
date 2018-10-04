package ru.geekbrains.Lesson7;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class J1Lesson7 {
    public static void main(String[] args) {
        Cat [] cats = new Cat[3];
        cats[0]= new Cat("Barsik", 5);
        cats[1]= new Cat("Tobik", 15);
        cats[2]= new Cat("SuperhungryPushok", 115);
        //cats = {};
        //{"Barsik", 5}, {"Tobik", 15},{"SuperhungryPushok", 115});
        Plate plate = new Plate(100);
		plate.info();
		for (int i=0; i<cats.length; i++) {
			cats[i].eat(plate);
			System.out.println("If "+cats[i].name+" is hungry? Answer is "+!(cats[i].stomackfull)+".");
		}
        plate.info();
    }
}


class Test {
    static void testString(int cycles) {
        System.out.print("Testing String... ");
        long t1 = System.currentTimeMillis();

        String a = "";
        for (int i = 0; i < cycles; i++)
            a += "w";

        long t2 = System.currentTimeMillis();
        System.out.println("It took " + (t2 - t1) + " mc");
    }

    /**
     * Testing class StringBuilder (mutable)
     */
    static void testStringBuilder(int cycles) {
        System.out.print("Testing StringBuilder... ");
        long t1 = System.currentTimeMillis();

        StringBuilder a = new StringBuilder("");
        for (int i = 0; i < cycles; i++)
            a.append("w");

        long t2 = System.currentTimeMillis();
        System.out.println("It took " + (t2 - t1) + " mc");
    }

    /**
     * Testing class FileReader
     */
    static void testFileReader(String fileName) {
        System.out.print("Testing FileReader... ");
        long t1 = System.currentTimeMillis();

        try (FileReader file = new FileReader(fileName)) {
            int x = -1;
            do
                x = file.read();
            while (x != -1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        long t2 = System.currentTimeMillis();
        System.out.println("It took " + (t2 - t1) + " mc");
    }

    /**
     * Testing class BufferedReader
     */
    static void testBufferedReader(String fileName) {
        System.out.print("Testing BufferedReader... ");
        long t1 = System.currentTimeMillis();

        try (BufferedReader file = new BufferedReader(
                new FileReader(fileName))) {
            int x = -1;
            do
                x = file.read();
            while (x != -1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        long t2 = System.currentTimeMillis();
        System.out.println("It took " + (t2 - t1) + " mc");
    }
}