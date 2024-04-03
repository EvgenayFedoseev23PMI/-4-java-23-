package com.company;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Неверное значение времени");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Неверное значение часов");
        }
        this.hours = hours;
    }
    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Неверное значение минут");
        }
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Неверное значение секунд");
        }
        this.seconds = seconds;
    }
    public void addHours(int addHours) {
        this.hours = (this.hours + addHours) % 24;
    }
    public void addMinutes(int addMinutes) {
        int newMinutes = this.minutes + addMinutes;
        this.addHours(newMinutes / 60);
        this.minutes = newMinutes % 60;
    }
    public void addSeconds(int addSeconds) {
        int newSeconds = this.seconds + addSeconds;
        this.addMinutes(newSeconds / 60);
        this.seconds = newSeconds % 60;
    }
    public String toString() {
        return String.format("%02d:%02d:02d",hours, minutes, seconds);
    }
}

