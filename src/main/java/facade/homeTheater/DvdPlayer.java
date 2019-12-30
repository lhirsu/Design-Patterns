package facade.homeTheater;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class DvdPlayer {

    private String name;
    private String movie;

    public DvdPlayer(String name) {
        this.name = name;
    }

    public void on() {
        log.info("DVD Player on");
    }

    public void off() {
        log.info("DVD Player off");
    }

    public void eject() {
        log.info("DVD Player eject");
    }

    public void stop() {
        log.info("DVD Player stopped \"" + movie + "\"");
    }

    public void play(String movie) {
        this.movie = movie;
        log.info("DVD Player playing \"" + movie + "\"");
    }

}