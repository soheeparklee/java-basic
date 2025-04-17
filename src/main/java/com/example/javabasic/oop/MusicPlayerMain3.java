package com.example.javabasic.oop;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        turnOn(data);
        raiseVolume(data);
        raiseVolume(data);
        decreaseVolume(data);
        printStatus(data);
        turnOff(data);
    }

    static void turnOn(MusicPlayerData data){
        data.isOn = true;
        System.out.println("music player is on");
    }

    static void turnOff(MusicPlayerData data){
        data.isOn = true;
        System.out.println("music player end");
    }

    static void raiseVolume(MusicPlayerData data){
        data.volume++;
        System.out.println("volume: " + data.volume);
    }

    static void decreaseVolume(MusicPlayerData data){
        data.volume--;
        System.out.println("volume: " + data.volume);
    }

    static void printStatus(MusicPlayerData data){
        if(data.isOn){
            System.out.println("music player is on. volume: " + data.volume);
        }else{
            System.out.println("music player is off");
        }
    }




}
