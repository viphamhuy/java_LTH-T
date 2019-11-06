package classStopWatch;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;

public class classStopWatch {
    private Date startTime, endTime;
    long milireset,miliStop;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public classStopWatch(){
        LocalTime startTime = LocalTime.now();
    }

    void start(){
        LocalTime reset = LocalTime.now();
        System.out.println("Time :" + reset);
        this.milireset = System.currentTimeMillis();
    }
    void stop(){
        LocalTime stop = LocalTime.now();
        System.out.println("Time end: " + stop +"\n");
        this.miliStop = System.currentTimeMillis();
    }

    void getElapsedTime(){
        long timePast = System.currentTimeMillis();
        System.out.println("Thời gian trôi qua: "+timePast);
    }

    public static void main(String[] args) {
        classStopWatch test = new classStopWatch();
        //test.start();
        //test.stop();
        test.getElapsedTime();
    }
}
