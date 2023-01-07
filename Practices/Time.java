package Practices;

public class Time {
    public static double timeStarted = System.nanoTime();
    //returns amount time game has been running
    public static double getTime(){return (System.nanoTime()-timeStarted) * 1E-9;}
}
