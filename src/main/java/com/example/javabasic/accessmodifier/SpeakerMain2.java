package com.example.javabasic.accessmodifier;

public class SpeakerMain2 {

    public static void main(String[] args) {
        Speaker2 speaker = new Speaker2(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        System.out.println(" ----- volume field modified ----- ");
        //speaker.volume = 200; //🔴 cannot access speaker.volume
        speaker.showVolume();

    }
}
