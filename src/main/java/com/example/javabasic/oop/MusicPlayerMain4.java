package com.example.javabasic.oop;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.turnOn();
        player.raiseVolume();
        player.raiseVolume();
        player.decreaseVolume();
        player.printStatus();
        player.turnOff();
    }
}
