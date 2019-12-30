package facade.homeTheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Amplifier {

    public void on() {
        log.info("Amplifier on");
    }

    public void off() {
        log.info("Amplifier off");
    }

    public void setSurroundSound() {
        log.info("Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        log.info("Amplifier setting volume to " + level);
    }

    public void setDvd(DvdPlayer dvdPlayer){
        log.info("Amplifier setting DVD player to " + dvdPlayer.getName());
    }

}