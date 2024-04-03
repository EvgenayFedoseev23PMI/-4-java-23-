package com.company;

public class Main {
    public static void main(String[] args) {
        try {
            Time time = new Time(12, 30, 45);
            System.out.println(time);
            time.setHours(20);
            time.setMinutes(53);
            time.setSeconds(30);
            System.out.println(time);
            time.addHours(13);
            time.addMinutes(30);
            time.addSeconds(15);
            System.out.println(time);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

