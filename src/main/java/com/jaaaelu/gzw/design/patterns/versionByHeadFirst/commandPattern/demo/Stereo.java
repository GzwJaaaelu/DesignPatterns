package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.commandPattern.demo;

/**
 * 音响
 */
public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }

    public void setCD() {
        System.out.println("Stereo is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume set to " + volume);
    }

    public void off() {
        System.out.println("Stereo is off");
    }
}
