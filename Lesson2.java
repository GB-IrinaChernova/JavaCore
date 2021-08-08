package ru.gb.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "1", "1", "1"}, {"0", "0", "0", "0"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        try {
            try {
                int result = method(arr);
                System.out.println("Сумма элементов массива: "+ result);
            } catch (MyArraySizeException e) {
                System.err.println("Размер массива превышен");
            }
        }
        catch (MyArrayDataException e) {
            System.err.println("Неправильное значение элемента массива");
            System.err.println("Ошибка в ячейке: " + (e.i+1) + "x" + (e.j+1));
        }
    }
    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}

