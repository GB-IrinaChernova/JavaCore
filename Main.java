package ru.gb.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple())));
        Box<Apple> newAppleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));
        Box<Orange> newOrangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange())));

        System.out.println("Apple box: " + appleBox);
        System.out.println("New Apple box: " + newAppleBox);
        System.out.println("Orange box: " + orangeBox);
        System.out.println("New Orange box: " + newOrangeBox);
        appleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(), new Apple())));
        appleBox.toAnotherBox(newAppleBox);
        System.out.println();
        System.out.println("New Apple box after add apples: " + newAppleBox);
        System.out.println("Apple box after remove apples: " + appleBox);
        System.out.println();
        System.out.println("New Apple box weight: " + newAppleBox.getWeight());
        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("New Orange box weight: " + newOrangeBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println();
        System.out.println(newAppleBox.compare(orangeBox));
        newAppleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(), new Apple())));
        //orangeBox.addFruits(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));
        newOrangeBox.addFruits(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));
        System.out.println("New Apple box weight: " + newAppleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println(newAppleBox.compare(orangeBox));
        //newOrangeBox.toAnotherBox(orangeBox);
        orangeBox.toAnotherBox(newOrangeBox);
        //System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println("Apple box: " + appleBox);
        System.out.println("New Apple box: " + newAppleBox);
        System.out.println("Orange box: " + orangeBox);
        System.out.println("New Orange box: " + newOrangeBox);
        System.out.println();
        System.out.println("New Apple box weight: " + newAppleBox.getWeight());
        System.out.println("New Orange box weight: " + newOrangeBox.getWeight());
        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println();

        Integer[] ints = {1, 2, 3, 4, 5, 6};
        Swap<Integer> integerSwap = new Swap<>();
        integerSwap.swap(ints, 2, 5);

        for (Integer i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();

        Float[] floats = {1.6f, 2.4f, 3.7f, 4.1f, 5.8f};
        Swap<Float> floatSwap = new Swap<>();
        floatSwap.swap(floats, 0, 4);

        for (Float i: floats) {
            System.out.print(i + " ");
        }
    }
}
