package com.example.javabasic.accessmodifier;

public class Speaker1 {
    int volume;

    Speaker1(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("too loud!!!!!!");
        }else{
            volume += 10;
            System.out.println("----- volume is +10 -----");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("----- volume is -10 -----");
    }

    void showVolume(){
        System.out.println("----- show current volume: ----- "+ volume);
    }
}
