package com.example.javabasic.accessmodifier;

public class SpeakerMain1 {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        System.out.println(" ----- volume field modified ----- ");
        speaker.volume = 200;
        speaker.showVolume();

    }
}
