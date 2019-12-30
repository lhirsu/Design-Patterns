package facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Projector {

    public void on() {
        log.info("Projector on");
    }

    public void wideScreenMode() {
        log.info("Projector in widescreen mode (16x9 aspect ratio)");
    }

    public void off() {
        log.info("Projector off");
    }

}