package facade;

import facade.homeTheater.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        HomeTheaterFacade facade = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer("Top-O-Line DVD Player"),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper()
        );

        log.info("=================================");
        facade.watchMovie("Raiders of the Lost Ark");
        log.info("=================================");
        facade.endMovie();
        log.info("=================================");

    }

}