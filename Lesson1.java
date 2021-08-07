package ru.gb.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new RunningTrack(100),
                new Wall(2),
                new RunningTrack(200),
                new Wall(3),
                new RunningTrack(300),
                new Wall(5)
        };

        Participant[] participants = {
                new Human("Максим",300, 2),
                new Cat(100, 4),
                new Robot(1000, 5),

        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.getStatus()) {
                    participant.overcomeObstacle(obstacle);
                }
            }
            System.out.println();
        }
    }
}
