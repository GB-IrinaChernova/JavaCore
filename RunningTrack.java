package ru.gb.lesson1;

public class RunningTrack implements Obstacle {
    public final int length;

    public RunningTrack(int length) {
        this.length = length;
    }
    public String toString() {
        return String.format("длиной " + length);
    }
}
