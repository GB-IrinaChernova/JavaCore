package ru.gb.lesson1;

public class Wall implements Obstacle {
        public final int height;

        public Wall(int height) {
            this.height = height;
        }
        public  String toString() {
            return String.format("высотой " + height);

        }
}
