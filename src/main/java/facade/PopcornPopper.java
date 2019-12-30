package facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PopcornPopper {

    public void on() {
        log.info("Popcorn popper on");
    }

    public void off() {
        log.info("Popcorn popper off");
    }

    public void pop() {
        log.info("Popper popping popcorn!");
    }

}