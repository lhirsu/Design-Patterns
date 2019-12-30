package facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Screen {

    public void up() {
        log.info("Theater screen going up");
    }

    public void down() {
        log.info("Theater screen going down");
    }

}