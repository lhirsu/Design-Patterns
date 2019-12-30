package facade;

import facade.homeTheater.*;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class HomeTheaterFacade {

    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = theaterLights;
        this.screen = screen;
        this.popper = popcornPopper;
    }

    public void watchMovie(String movie) {
        log.info("Get ready to watch a movie..");

        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);

    }

    public void endMovie() {
        log.info("Shutting movie theater down..");

        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}