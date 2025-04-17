package com.example.javabasic.oop;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("start music player");

        data.volume++;
        System.out.println("volume: " + data.volume);
        data.volume++;
        System.out.println("volume: " + data.volume);

        data.volume--;
        System.out.println("volume: " + data.volume);

        System.out.println("music player status");
        if(data.isOn){
            System.out.println("music player is on. volume: " + data.volume);
        }else{
            System.out.println("music player is off");
        }

        data.isOn= false;
        System.out.println("music player end");
    }
}
