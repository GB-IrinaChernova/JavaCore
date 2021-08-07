package ru.gb.lesson1;

public class Cat implements Participant {
    public boolean lost = false;
    private final int runLimit;
    private final int jumpLimit;

    public Cat(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean getStatus() {
        return this.lost;
    }

    public void run(RunningTrack runningTrack) {
        if (runningTrack.length <= runLimit) {
            System.out.println("кот преодолел беговую дорожку " + runningTrack);
        } else {
            System.out.println("Кот не преодолел беговую дорожку " + runningTrack);
            lost = true;
        }
    }

    public void jump(Wall wall) {
        if (wall.height <= jumpLimit) {
            System.out.println("Кот преодолел стену " + wall);
        } else {
            System.out.println("Кот не преодолел стену " + wall);
            lost = true;
        }
    }
}


