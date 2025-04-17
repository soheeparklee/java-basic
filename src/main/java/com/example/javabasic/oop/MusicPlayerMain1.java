package com.example.javabasic.oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("start music player");

        volume++;
        System.out.println("volume: " + volume);
        volume++;
        System.out.println("volume: " + volume);

        volume--;
        System.out.println("volume: " + volume);

        System.out.println("music player status");
        if(isOn){
            System.out.println("music player is on. volume: " + volume);
        }else{
            System.out.println("music player is off");
        }

        isOn= false;
        System.out.println("music player end");
    }
}
