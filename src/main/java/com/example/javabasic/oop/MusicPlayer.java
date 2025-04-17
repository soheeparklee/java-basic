package com.example.javabasic.oop;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("music player is on");
    }

    void turnOff(){
        isOn = true;
        System.out.println("music player end");
    }

    void raiseVolume(){
        volume++;
        System.out.println("volume: " + volume);
    }

    void decreaseVolume(){
        volume--;
        System.out.println("volume: " + volume);
    }

    void printStatus(){
        if(isOn){
            System.out.println("music player is on. volume: " + volume);
        }else{
            System.out.println("music player is off");
        }
    }
}
