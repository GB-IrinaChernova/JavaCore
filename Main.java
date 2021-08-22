package ru.gb.lesson5;

public class Main {
    public static final String PATH = "src/main/java/ru/gb/lesson5/demo.csv";

    public static void main(String[] args) {
        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int[][] data = { {100, 200, 123}, {300, 400, 500}};

        AppData appData = new AppData(headers, data);

        appData.writeToFile(PATH);
        AppData receivedAppData = AppData.readFromFile(PATH);
        System.out.println(receivedAppData);

        }
    }