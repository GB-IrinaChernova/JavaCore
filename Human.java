package ru.gb.lesson1;

public class Human implements Participant {
    String name;
    public boolean lost = false;
    private final int runLimit;
    private final int jumpLimit;

    public Human(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean getStatus() {
        return this.lost;
    }

    public void run(RunningTrack runningTrack) {
        if (runningTrack.length <= runLimit) {
            System.out.println(name +" преодолел беговую дорожку " + runningTrack);
        } else {
            System.out.println(name +" не преодолел беговую дорожку " + runningTrack);
            lost = true;
        }
    }

    public void jump(Wall wall) {
        if (wall.height <= jumpLimit) {
            System.out.println(name +" преодолел стену " + wall);
        } else {
            System.out.println(name +" не преодолел стену " + wall);
            lost = true;
        }
    }
}

