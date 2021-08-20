package ru.gb.lesson4;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("один", "два", "три", "два", "два", "пять"));

        printWithoutDuplicates(stringList);
        countDuplicates(stringList);
        testPhoneBook();
    }
    public static void printWithoutDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        System.out.println(inputSet);
    }
    public static void countDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        for (String word : input) {
            int count = 0;
            for (String inner : input) {
                if (word.equals(inner)) {
                    count++;
                }
            }
            System.out.printf("%s: %d\n", word, count);
        }
    }
    public static void testPhoneBook() {
        PhoneBook.add("Ivanov", "+8 495 123");
        PhoneBook.add("Petrov", "+8 495 234");
        PhoneBook.add("Sidorov", "+8 495 345");
        PhoneBook.add("Ivanov", "+8 495 456");
        PhoneBook.add("Chernov", "+8 495 567");
        PhoneBook.add("Popov", "+8 495 678");

        PhoneBook.get("Ivanov");
    }
}
