package facade.homeTheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TheaterLights {

    public void on() {
        log.info("Theater ceiling lights on");
    }

    public void dim(int percent) {
        log.info("Theater ceiling lights dim to " + percent + "%");
    }

}